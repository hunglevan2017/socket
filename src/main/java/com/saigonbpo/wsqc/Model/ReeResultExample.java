package com.saigonbpo.wsqc.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReeResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReeResultExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStrMd5IsNull() {
            addCriterion("str_md5 is null");
            return (Criteria) this;
        }

        public Criteria andStrMd5IsNotNull() {
            addCriterion("str_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andStrMd5EqualTo(String value) {
            addCriterion("str_md5 =", value, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5NotEqualTo(String value) {
            addCriterion("str_md5 <>", value, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5GreaterThan(String value) {
            addCriterion("str_md5 >", value, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5GreaterThanOrEqualTo(String value) {
            addCriterion("str_md5 >=", value, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5LessThan(String value) {
            addCriterion("str_md5 <", value, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5LessThanOrEqualTo(String value) {
            addCriterion("str_md5 <=", value, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5Like(String value) {
            addCriterion("str_md5 like", value, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5NotLike(String value) {
            addCriterion("str_md5 not like", value, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5In(List<String> values) {
            addCriterion("str_md5 in", values, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5NotIn(List<String> values) {
            addCriterion("str_md5 not in", values, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5Between(String value1, String value2) {
            addCriterion("str_md5 between", value1, value2, "strMd5");
            return (Criteria) this;
        }

        public Criteria andStrMd5NotBetween(String value1, String value2) {
            addCriterion("str_md5 not between", value1, value2, "strMd5");
            return (Criteria) this;
        }

        public Criteria andDiceIsNull() {
            addCriterion("dice is null");
            return (Criteria) this;
        }

        public Criteria andDiceIsNotNull() {
            addCriterion("dice is not null");
            return (Criteria) this;
        }

        public Criteria andDiceEqualTo(String value) {
            addCriterion("dice =", value, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceNotEqualTo(String value) {
            addCriterion("dice <>", value, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceGreaterThan(String value) {
            addCriterion("dice >", value, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceGreaterThanOrEqualTo(String value) {
            addCriterion("dice >=", value, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceLessThan(String value) {
            addCriterion("dice <", value, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceLessThanOrEqualTo(String value) {
            addCriterion("dice <=", value, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceLike(String value) {
            addCriterion("dice like", value, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceNotLike(String value) {
            addCriterion("dice not like", value, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceIn(List<String> values) {
            addCriterion("dice in", values, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceNotIn(List<String> values) {
            addCriterion("dice not in", values, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceBetween(String value1, String value2) {
            addCriterion("dice between", value1, value2, "dice");
            return (Criteria) this;
        }

        public Criteria andDiceNotBetween(String value1, String value2) {
            addCriterion("dice not between", value1, value2, "dice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceIsNull() {
            addCriterion("total_dice is null");
            return (Criteria) this;
        }

        public Criteria andTotalDiceIsNotNull() {
            addCriterion("total_dice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDiceEqualTo(String value) {
            addCriterion("total_dice =", value, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceNotEqualTo(String value) {
            addCriterion("total_dice <>", value, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceGreaterThan(String value) {
            addCriterion("total_dice >", value, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceGreaterThanOrEqualTo(String value) {
            addCriterion("total_dice >=", value, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceLessThan(String value) {
            addCriterion("total_dice <", value, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceLessThanOrEqualTo(String value) {
            addCriterion("total_dice <=", value, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceLike(String value) {
            addCriterion("total_dice like", value, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceNotLike(String value) {
            addCriterion("total_dice not like", value, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceIn(List<String> values) {
            addCriterion("total_dice in", values, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceNotIn(List<String> values) {
            addCriterion("total_dice not in", values, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceBetween(String value1, String value2) {
            addCriterion("total_dice between", value1, value2, "totalDice");
            return (Criteria) this;
        }

        public Criteria andTotalDiceNotBetween(String value1, String value2) {
            addCriterion("total_dice not between", value1, value2, "totalDice");
            return (Criteria) this;
        }

        public Criteria andMoneyBetIsNull() {
            addCriterion("money_bet is null");
            return (Criteria) this;
        }

        public Criteria andMoneyBetIsNotNull() {
            addCriterion("money_bet is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyBetEqualTo(String value) {
            addCriterion("money_bet =", value, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetNotEqualTo(String value) {
            addCriterion("money_bet <>", value, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetGreaterThan(String value) {
            addCriterion("money_bet >", value, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetGreaterThanOrEqualTo(String value) {
            addCriterion("money_bet >=", value, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetLessThan(String value) {
            addCriterion("money_bet <", value, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetLessThanOrEqualTo(String value) {
            addCriterion("money_bet <=", value, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetLike(String value) {
            addCriterion("money_bet like", value, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetNotLike(String value) {
            addCriterion("money_bet not like", value, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetIn(List<String> values) {
            addCriterion("money_bet in", values, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetNotIn(List<String> values) {
            addCriterion("money_bet not in", values, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetBetween(String value1, String value2) {
            addCriterion("money_bet between", value1, value2, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andMoneyBetNotBetween(String value1, String value2) {
            addCriterion("money_bet not between", value1, value2, "moneyBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetIsNull() {
            addCriterion("choose_bet is null");
            return (Criteria) this;
        }

        public Criteria andChooseBetIsNotNull() {
            addCriterion("choose_bet is not null");
            return (Criteria) this;
        }

        public Criteria andChooseBetEqualTo(String value) {
            addCriterion("choose_bet =", value, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetNotEqualTo(String value) {
            addCriterion("choose_bet <>", value, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetGreaterThan(String value) {
            addCriterion("choose_bet >", value, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetGreaterThanOrEqualTo(String value) {
            addCriterion("choose_bet >=", value, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetLessThan(String value) {
            addCriterion("choose_bet <", value, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetLessThanOrEqualTo(String value) {
            addCriterion("choose_bet <=", value, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetLike(String value) {
            addCriterion("choose_bet like", value, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetNotLike(String value) {
            addCriterion("choose_bet not like", value, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetIn(List<String> values) {
            addCriterion("choose_bet in", values, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetNotIn(List<String> values) {
            addCriterion("choose_bet not in", values, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetBetween(String value1, String value2) {
            addCriterion("choose_bet between", value1, value2, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andChooseBetNotBetween(String value1, String value2) {
            addCriterion("choose_bet not between", value1, value2, "chooseBet");
            return (Criteria) this;
        }

        public Criteria andResultBetIsNull() {
            addCriterion("result_bet is null");
            return (Criteria) this;
        }

        public Criteria andResultBetIsNotNull() {
            addCriterion("result_bet is not null");
            return (Criteria) this;
        }

        public Criteria andResultBetEqualTo(String value) {
            addCriterion("result_bet =", value, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetNotEqualTo(String value) {
            addCriterion("result_bet <>", value, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetGreaterThan(String value) {
            addCriterion("result_bet >", value, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetGreaterThanOrEqualTo(String value) {
            addCriterion("result_bet >=", value, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetLessThan(String value) {
            addCriterion("result_bet <", value, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetLessThanOrEqualTo(String value) {
            addCriterion("result_bet <=", value, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetLike(String value) {
            addCriterion("result_bet like", value, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetNotLike(String value) {
            addCriterion("result_bet not like", value, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetIn(List<String> values) {
            addCriterion("result_bet in", values, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetNotIn(List<String> values) {
            addCriterion("result_bet not in", values, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetBetween(String value1, String value2) {
            addCriterion("result_bet between", value1, value2, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultBetNotBetween(String value1, String value2) {
            addCriterion("result_bet not between", value1, value2, "resultBet");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerIsNull() {
            addCriterion("money_player is null");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerIsNotNull() {
            addCriterion("money_player is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerEqualTo(String value) {
            addCriterion("money_player =", value, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerNotEqualTo(String value) {
            addCriterion("money_player <>", value, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerGreaterThan(String value) {
            addCriterion("money_player >", value, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerGreaterThanOrEqualTo(String value) {
            addCriterion("money_player >=", value, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerLessThan(String value) {
            addCriterion("money_player <", value, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerLessThanOrEqualTo(String value) {
            addCriterion("money_player <=", value, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerLike(String value) {
            addCriterion("money_player like", value, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerNotLike(String value) {
            addCriterion("money_player not like", value, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerIn(List<String> values) {
            addCriterion("money_player in", values, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerNotIn(List<String> values) {
            addCriterion("money_player not in", values, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerBetween(String value1, String value2) {
            addCriterion("money_player between", value1, value2, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andMoneyPlayerNotBetween(String value1, String value2) {
            addCriterion("money_player not between", value1, value2, "moneyPlayer");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNull() {
            addCriterion("insert_date is null");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNotNull() {
            addCriterion("insert_date is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDateEqualTo(Date value) {
            addCriterion("insert_date =", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotEqualTo(Date value) {
            addCriterion("insert_date <>", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThan(Date value) {
            addCriterion("insert_date >", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_date >=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThan(Date value) {
            addCriterion("insert_date <", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThanOrEqualTo(Date value) {
            addCriterion("insert_date <=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateIn(List<Date> values) {
            addCriterion("insert_date in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotIn(List<Date> values) {
            addCriterion("insert_date not in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateBetween(Date value1, Date value2) {
            addCriterion("insert_date between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotBetween(Date value1, Date value2) {
            addCriterion("insert_date not between", value1, value2, "insertDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}