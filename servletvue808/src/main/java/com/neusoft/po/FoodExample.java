package com.neusoft.po;

import java.util.ArrayList;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
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

        public Criteria andFoodidIsNull() {
            addCriterion("foodId is null");
            return (Criteria) this;
        }

        public Criteria andFoodidIsNotNull() {
            addCriterion("foodId is not null");
            return (Criteria) this;
        }

        public Criteria andFoodidEqualTo(Integer value) {
            addCriterion("foodId =", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidNotEqualTo(Integer value) {
            addCriterion("foodId <>", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidGreaterThan(Integer value) {
            addCriterion("foodId >", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("foodId >=", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidLessThan(Integer value) {
            addCriterion("foodId <", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidLessThanOrEqualTo(Integer value) {
            addCriterion("foodId <=", value, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidIn(List<Integer> values) {
            addCriterion("foodId in", values, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidNotIn(List<Integer> values) {
            addCriterion("foodId not in", values, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidBetween(Integer value1, Integer value2) {
            addCriterion("foodId between", value1, value2, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("foodId not between", value1, value2, "foodid");
            return (Criteria) this;
        }

        public Criteria andFoodnameIsNull() {
            addCriterion("foodName is null");
            return (Criteria) this;
        }

        public Criteria andFoodnameIsNotNull() {
            addCriterion("foodName is not null");
            return (Criteria) this;
        }

        public Criteria andFoodnameEqualTo(String value) {
            addCriterion("foodName =", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotEqualTo(String value) {
            addCriterion("foodName <>", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThan(String value) {
            addCriterion("foodName >", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("foodName >=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThan(String value) {
            addCriterion("foodName <", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThanOrEqualTo(String value) {
            addCriterion("foodName <=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLike(String value) {
            addCriterion("foodName like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotLike(String value) {
            addCriterion("foodName not like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameIn(List<String> values) {
            addCriterion("foodName in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotIn(List<String> values) {
            addCriterion("foodName not in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameBetween(String value1, String value2) {
            addCriterion("foodName between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotBetween(String value1, String value2) {
            addCriterion("foodName not between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodexplainIsNull() {
            addCriterion("foodExplain is null");
            return (Criteria) this;
        }

        public Criteria andFoodexplainIsNotNull() {
            addCriterion("foodExplain is not null");
            return (Criteria) this;
        }

        public Criteria andFoodexplainEqualTo(String value) {
            addCriterion("foodExplain =", value, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainNotEqualTo(String value) {
            addCriterion("foodExplain <>", value, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainGreaterThan(String value) {
            addCriterion("foodExplain >", value, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainGreaterThanOrEqualTo(String value) {
            addCriterion("foodExplain >=", value, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainLessThan(String value) {
            addCriterion("foodExplain <", value, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainLessThanOrEqualTo(String value) {
            addCriterion("foodExplain <=", value, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainLike(String value) {
            addCriterion("foodExplain like", value, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainNotLike(String value) {
            addCriterion("foodExplain not like", value, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainIn(List<String> values) {
            addCriterion("foodExplain in", values, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainNotIn(List<String> values) {
            addCriterion("foodExplain not in", values, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainBetween(String value1, String value2) {
            addCriterion("foodExplain between", value1, value2, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodexplainNotBetween(String value1, String value2) {
            addCriterion("foodExplain not between", value1, value2, "foodexplain");
            return (Criteria) this;
        }

        public Criteria andFoodpriceIsNull() {
            addCriterion("foodPrice is null");
            return (Criteria) this;
        }

        public Criteria andFoodpriceIsNotNull() {
            addCriterion("foodPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFoodpriceEqualTo(Double value) {
            addCriterion("foodPrice =", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceNotEqualTo(Double value) {
            addCriterion("foodPrice <>", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceGreaterThan(Double value) {
            addCriterion("foodPrice >", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("foodPrice >=", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceLessThan(Double value) {
            addCriterion("foodPrice <", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceLessThanOrEqualTo(Double value) {
            addCriterion("foodPrice <=", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceIn(List<Double> values) {
            addCriterion("foodPrice in", values, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceNotIn(List<Double> values) {
            addCriterion("foodPrice not in", values, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceBetween(Double value1, Double value2) {
            addCriterion("foodPrice between", value1, value2, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceNotBetween(Double value1, Double value2) {
            addCriterion("foodPrice not between", value1, value2, "foodprice");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNull() {
            addCriterion("businessId is null");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNotNull() {
            addCriterion("businessId is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessidEqualTo(Integer value) {
            addCriterion("businessId =", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotEqualTo(Integer value) {
            addCriterion("businessId <>", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThan(Integer value) {
            addCriterion("businessId >", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessId >=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThan(Integer value) {
            addCriterion("businessId <", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThanOrEqualTo(Integer value) {
            addCriterion("businessId <=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIn(List<Integer> values) {
            addCriterion("businessId in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotIn(List<Integer> values) {
            addCriterion("businessId not in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidBetween(Integer value1, Integer value2) {
            addCriterion("businessId between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotBetween(Integer value1, Integer value2) {
            addCriterion("businessId not between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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