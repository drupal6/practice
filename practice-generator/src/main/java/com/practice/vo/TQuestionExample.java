package com.practice.vo;

import java.util.ArrayList;
import java.util.List;

public class TQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TQuestionExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Long value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Long value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Long value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Long value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Long value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Long> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Long> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Long value1, Long value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Long value1, Long value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andQSeqIsNull() {
            addCriterion("q_seq is null");
            return (Criteria) this;
        }

        public Criteria andQSeqIsNotNull() {
            addCriterion("q_seq is not null");
            return (Criteria) this;
        }

        public Criteria andQSeqEqualTo(Byte value) {
            addCriterion("q_seq =", value, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQSeqNotEqualTo(Byte value) {
            addCriterion("q_seq <>", value, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQSeqGreaterThan(Byte value) {
            addCriterion("q_seq >", value, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQSeqGreaterThanOrEqualTo(Byte value) {
            addCriterion("q_seq >=", value, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQSeqLessThan(Byte value) {
            addCriterion("q_seq <", value, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQSeqLessThanOrEqualTo(Byte value) {
            addCriterion("q_seq <=", value, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQSeqIn(List<Byte> values) {
            addCriterion("q_seq in", values, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQSeqNotIn(List<Byte> values) {
            addCriterion("q_seq not in", values, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQSeqBetween(Byte value1, Byte value2) {
            addCriterion("q_seq between", value1, value2, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQSeqNotBetween(Byte value1, Byte value2) {
            addCriterion("q_seq not between", value1, value2, "qSeq");
            return (Criteria) this;
        }

        public Criteria andQTypeIsNull() {
            addCriterion("q_type is null");
            return (Criteria) this;
        }

        public Criteria andQTypeIsNotNull() {
            addCriterion("q_type is not null");
            return (Criteria) this;
        }

        public Criteria andQTypeEqualTo(Byte value) {
            addCriterion("q_type =", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotEqualTo(Byte value) {
            addCriterion("q_type <>", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeGreaterThan(Byte value) {
            addCriterion("q_type >", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("q_type >=", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLessThan(Byte value) {
            addCriterion("q_type <", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLessThanOrEqualTo(Byte value) {
            addCriterion("q_type <=", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeIn(List<Byte> values) {
            addCriterion("q_type in", values, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotIn(List<Byte> values) {
            addCriterion("q_type not in", values, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeBetween(Byte value1, Byte value2) {
            addCriterion("q_type between", value1, value2, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("q_type not between", value1, value2, "qType");
            return (Criteria) this;
        }

        public Criteria andQIdIsNull() {
            addCriterion("q_id is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("q_id is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(Long value) {
            addCriterion("q_id =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(Long value) {
            addCriterion("q_id <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(Long value) {
            addCriterion("q_id >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(Long value) {
            addCriterion("q_id >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(Long value) {
            addCriterion("q_id <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(Long value) {
            addCriterion("q_id <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<Long> values) {
            addCriterion("q_id in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<Long> values) {
            addCriterion("q_id not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(Long value1, Long value2) {
            addCriterion("q_id between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(Long value1, Long value2) {
            addCriterion("q_id not between", value1, value2, "qId");
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