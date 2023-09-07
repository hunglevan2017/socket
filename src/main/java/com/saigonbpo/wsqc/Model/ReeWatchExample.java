package com.saigonbpo.wsqc.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReeWatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReeWatchExample() {
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

        public Criteria andResultBetBinIsNull() {
            addCriterion("result_bet_bin is null");
            return (Criteria) this;
        }

        public Criteria andResultBetBinIsNotNull() {
            addCriterion("result_bet_bin is not null");
            return (Criteria) this;
        }

        public Criteria andResultBetBinEqualTo(String value) {
            addCriterion("result_bet_bin =", value, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinNotEqualTo(String value) {
            addCriterion("result_bet_bin <>", value, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinGreaterThan(String value) {
            addCriterion("result_bet_bin >", value, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinGreaterThanOrEqualTo(String value) {
            addCriterion("result_bet_bin >=", value, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinLessThan(String value) {
            addCriterion("result_bet_bin <", value, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinLessThanOrEqualTo(String value) {
            addCriterion("result_bet_bin <=", value, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinLike(String value) {
            addCriterion("result_bet_bin like", value, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinNotLike(String value) {
            addCriterion("result_bet_bin not like", value, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinIn(List<String> values) {
            addCriterion("result_bet_bin in", values, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinNotIn(List<String> values) {
            addCriterion("result_bet_bin not in", values, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinBetween(String value1, String value2) {
            addCriterion("result_bet_bin between", value1, value2, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andResultBetBinNotBetween(String value1, String value2) {
            addCriterion("result_bet_bin not between", value1, value2, "resultBetBin");
            return (Criteria) this;
        }

        public Criteria andTrendIsNull() {
            addCriterion("trend is null");
            return (Criteria) this;
        }

        public Criteria andTrendIsNotNull() {
            addCriterion("trend is not null");
            return (Criteria) this;
        }

        public Criteria andTrendEqualTo(String value) {
            addCriterion("trend =", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotEqualTo(String value) {
            addCriterion("trend <>", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThan(String value) {
            addCriterion("trend >", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThanOrEqualTo(String value) {
            addCriterion("trend >=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThan(String value) {
            addCriterion("trend <", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThanOrEqualTo(String value) {
            addCriterion("trend <=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLike(String value) {
            addCriterion("trend like", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotLike(String value) {
            addCriterion("trend not like", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendIn(List<String> values) {
            addCriterion("trend in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotIn(List<String> values) {
            addCriterion("trend not in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendBetween(String value1, String value2) {
            addCriterion("trend between", value1, value2, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotBetween(String value1, String value2) {
            addCriterion("trend not between", value1, value2, "trend");
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