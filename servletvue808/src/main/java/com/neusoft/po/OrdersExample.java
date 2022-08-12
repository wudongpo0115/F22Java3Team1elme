package com.neusoft.po;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
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

        public Criteria andOrderdateIsNull() {
            addCriterion("orderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(String value) {
            addCriterion("orderDate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(String value) {
            addCriterion("orderDate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(String value) {
            addCriterion("orderDate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(String value) {
            addCriterion("orderDate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(String value) {
            addCriterion("orderDate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(String value) {
            addCriterion("orderDate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLike(String value) {
            addCriterion("orderDate like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotLike(String value) {
            addCriterion("orderDate not like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<String> values) {
            addCriterion("orderDate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<String> values) {
            addCriterion("orderDate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(String value1, String value2) {
            addCriterion("orderDate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(String value1, String value2) {
            addCriterion("orderDate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrdertotalIsNull() {
            addCriterion("orderTotal is null");
            return (Criteria) this;
        }

        public Criteria andOrdertotalIsNotNull() {
            addCriterion("orderTotal is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertotalEqualTo(Double value) {
            addCriterion("orderTotal =", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalNotEqualTo(Double value) {
            addCriterion("orderTotal <>", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalGreaterThan(Double value) {
            addCriterion("orderTotal >", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalGreaterThanOrEqualTo(Double value) {
            addCriterion("orderTotal >=", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalLessThan(Double value) {
            addCriterion("orderTotal <", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalLessThanOrEqualTo(Double value) {
            addCriterion("orderTotal <=", value, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalIn(List<Double> values) {
            addCriterion("orderTotal in", values, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalNotIn(List<Double> values) {
            addCriterion("orderTotal not in", values, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalBetween(Double value1, Double value2) {
            addCriterion("orderTotal between", value1, value2, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andOrdertotalNotBetween(Double value1, Double value2) {
            addCriterion("orderTotal not between", value1, value2, "ordertotal");
            return (Criteria) this;
        }

        public Criteria andDaidIsNull() {
            addCriterion("daId is null");
            return (Criteria) this;
        }

        public Criteria andDaidIsNotNull() {
            addCriterion("daId is not null");
            return (Criteria) this;
        }

        public Criteria andDaidEqualTo(Integer value) {
            addCriterion("daId =", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidNotEqualTo(Integer value) {
            addCriterion("daId <>", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidGreaterThan(Integer value) {
            addCriterion("daId >", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("daId >=", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidLessThan(Integer value) {
            addCriterion("daId <", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidLessThanOrEqualTo(Integer value) {
            addCriterion("daId <=", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidIn(List<Integer> values) {
            addCriterion("daId in", values, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidNotIn(List<Integer> values) {
            addCriterion("daId not in", values, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidBetween(Integer value1, Integer value2) {
            addCriterion("daId between", value1, value2, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidNotBetween(Integer value1, Integer value2) {
            addCriterion("daId not between", value1, value2, "daid");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("orderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("orderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Integer value) {
            addCriterion("orderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Integer value) {
            addCriterion("orderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Integer value) {
            addCriterion("orderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Integer value) {
            addCriterion("orderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Integer value) {
            addCriterion("orderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Integer> values) {
            addCriterion("orderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Integer> values) {
            addCriterion("orderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Integer value1, Integer value2) {
            addCriterion("orderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Integer value1, Integer value2) {
            addCriterion("orderState not between", value1, value2, "orderstate");
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