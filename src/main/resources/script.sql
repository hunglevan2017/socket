-- Function: public.aimoney_un_normal()

-- DROP FUNCTION public.aimoney_un_normal();

CREATE OR REPLACE FUNCTION public.aimoney_un_normal()
  RETURNS character varying AS
$BODY$
DECLARE
    result character varying := '';
    rec record;
BEGIN	
	 for rec in 
		SELECT *
		FROM   ree_watch
		where trend is null
		ORDER  BY id desc
	loop 
		--raise notice '% - % ', rec.dice, rec.total_dice;
		update ree_watch x set trend = CASE
						 WHEN (y.total_dice::int % 2) = 0 and x.total_dice::int<=10 and (x.total_dice::int%2)=1 THEN 'Normal -> large | Total_Dice even >> small | odd > large'
						 WHEN (y.total_dice::int % 2) = 0 and x.total_dice::int<=10 and (x.total_dice::int%2)=0 THEN 'Normal -> Small | Total_Dice even >> small | odd > large'
						 WHEN (y.total_dice::int % 2) = 1 and x.total_dice::int>10 and (x.total_dice::int%2)=1 THEN 'Normal -> Large | Total_Dice even >> small | odd > large'
						 WHEN (y.total_dice::int % 2) = 1 and x.total_dice::int>10 and (x.total_dice::int%2)=0 THEN 'Normal -> small | Total_Dice even >> small | odd > large'
						 ELSE 'UnNormal'
					END
		from (select * from ree_watch where id < rec.id order by id desc limit 1) y
		where x.id = rec.id;
	end loop;

	with last_records as (

		select *
		from ree_watch
		order by id desc
		limit 1
	),
	t as (
		select *
		from last_records
		where trend = 'UnNormal'
	)
	select ((total_dice::int)%2)::varchar   into result
	from t;
	return result;
END;	
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;
ALTER FUNCTION public.aimoney_un_normal() SET search_path=public;

ALTER FUNCTION public.aimoney_un_normal()
  OWNER TO rls_dev;

-- Function: public.aimoney_normal()

-- DROP FUNCTION public.aimoney_normal();

CREATE OR REPLACE FUNCTION public.aimoney_normal()
  RETURNS character varying AS
$BODY$
DECLARE
    result character varying := '';
    rec record;
BEGIN	
	 for rec in 
		SELECT *
		FROM   ree_watch
		where trend is null
		ORDER  BY id desc
	loop 
		--raise notice '% - % ', rec.dice, rec.total_dice;
		update ree_watch x set trend = CASE
						 WHEN (y.total_dice::int % 2) = 0 and x.total_dice::int<=10 and (x.total_dice::int%2)=1 THEN 'Normal -> large | Total_Dice even >> small | odd > large'
						 WHEN (y.total_dice::int % 2) = 0 and x.total_dice::int<=10 and (x.total_dice::int%2)=0 THEN 'Normal -> Small | Total_Dice even >> small | odd > large'
						 WHEN (y.total_dice::int % 2) = 1 and x.total_dice::int>10 and (x.total_dice::int%2)=1 THEN 'Normal -> Large | Total_Dice even >> small | odd > large'
						 WHEN (y.total_dice::int % 2) = 1 and x.total_dice::int>10 and (x.total_dice::int%2)=0 THEN 'Normal -> small | Total_Dice even >> small | odd > large'
						 ELSE 'UnNormal'
					END
		from (select * from ree_watch where id < rec.id order by id desc limit 1) y
		where x.id = rec.id;
	end loop;

	with last_records as (

		select *
		from ree_watch
		order by id desc
		limit 1
	),
	t as (
		select *
		from last_records
		where trend <>'UnNormal'
	)
	select ((total_dice::int)%2)::varchar  into result
	from t;
	return result;
END;	
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;
ALTER FUNCTION public.aimoney_normal() SET search_path=public;

ALTER FUNCTION public.aimoney_normal()
  OWNER TO rls_dev;


-- Function: public.sp_update_trend()

-- DROP FUNCTION public.sp_update_trend();

CREATE OR REPLACE FUNCTION public.sp_update_trend()
  RETURNS refcursor AS
$BODY$
DECLARE

	rec record;
	vCursorReturn refcursor := 'sp_update_trend';
BEGIN	
   
    for rec in 
        SELECT *
        FROM   ree_watch
        where trend is null
        ORDER  BY id desc
    loop 
	--raise notice '% - % ', rec.dice, rec.total_dice;
	update ree_watch x set trend = CASE
						 WHEN (y.total_dice::int % 2) = 0 and x.total_dice::int<=10 THEN 'Normal -> Small | Total_Dice even >> small | odd > large'
						 WHEN (y.total_dice::int % 2) = 1 and x.total_dice::int>10 THEN 'Normal -> Large | Total_Dice even >> small | odd > large'
						 ELSE 'UnNormal'
					END
	from (select * from ree_watch where id < rec.id order by id desc limit 1) y
	where x.id = rec.id;
    end loop;

	OPEN vCursorReturn  for
	select *
	from ree_watch
	order by id desc
	limit 21;
	return vCursorReturn;

END;	
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;
ALTER FUNCTION public.sp_update_trend() SET search_path=public;

ALTER FUNCTION public.sp_update_trend()
  OWNER TO rls_dev;

CREATE TABLE public.ree_result
(
  id bigint NOT NULL DEFAULT nextval('ree_result_id_seq'::regclass),
  str_md5 character varying,
  dice character varying,
  total_dice character varying,
  money_bet character varying,
  choose_bet character varying,
  result_bet character varying,
  result character varying,
  money_player character varying,
  note character varying,
  insert_date timestamp without time zone DEFAULT now(),
  CONSTRAINT rree_resultpkey PRIMARY KEY (id),
  CONSTRAINT unique_md5_result UNIQUE (str_md5)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.ree_result
  OWNER TO rls_dev;

  -- Table: public.ree_watch

-- DROP TABLE public.ree_watch;

CREATE TABLE public.ree_watch
(
  id bigint NOT NULL DEFAULT nextval('ree_watch_id_seq'::regclass),
  str_md5 character varying,
  dice character varying,
  total_dice character varying,
  result_bet character varying,
  insert_date timestamp without time zone DEFAULT now(),
  result_bet_bin character varying,
  trend character varying,
  CONSTRAINT pk_ree_watch PRIMARY KEY (id),
  CONSTRAINT uniquemd5 UNIQUE (str_md5)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.ree_watch
  OWNER TO rls_dev;

-- Trigger: UpdatedTrend on public.ree_watch

-- DROP TRIGGER "UpdatedTrend" ON public.ree_watch;

CREATE TRIGGER "UpdatedTrend"
  AFTER INSERT
  ON public.ree_watch
  FOR EACH ROW
  EXECUTE PROCEDURE public.func_update_trend();

  
  
  