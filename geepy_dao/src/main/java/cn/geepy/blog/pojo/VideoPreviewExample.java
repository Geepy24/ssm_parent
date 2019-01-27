package cn.geepy.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class VideoPreviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoPreviewExample() {
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

        public Criteria andVpIdIsNull() {
            addCriterion("vp_id is null");
            return (Criteria) this;
        }

        public Criteria andVpIdIsNotNull() {
            addCriterion("vp_id is not null");
            return (Criteria) this;
        }

        public Criteria andVpIdEqualTo(Integer value) {
            addCriterion("vp_id =", value, "vpId");
            return (Criteria) this;
        }

        public Criteria andVpIdNotEqualTo(Integer value) {
            addCriterion("vp_id <>", value, "vpId");
            return (Criteria) this;
        }

        public Criteria andVpIdGreaterThan(Integer value) {
            addCriterion("vp_id >", value, "vpId");
            return (Criteria) this;
        }

        public Criteria andVpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vp_id >=", value, "vpId");
            return (Criteria) this;
        }

        public Criteria andVpIdLessThan(Integer value) {
            addCriterion("vp_id <", value, "vpId");
            return (Criteria) this;
        }

        public Criteria andVpIdLessThanOrEqualTo(Integer value) {
            addCriterion("vp_id <=", value, "vpId");
            return (Criteria) this;
        }

        public Criteria andVpIdIn(List<Integer> values) {
            addCriterion("vp_id in", values, "vpId");
            return (Criteria) this;
        }

        public Criteria andVpIdNotIn(List<Integer> values) {
            addCriterion("vp_id not in", values, "vpId");
            return (Criteria) this;
        }

        public Criteria andVpIdBetween(Integer value1, Integer value2) {
            addCriterion("vp_id between", value1, value2, "vpId");
            return (Criteria) this;
        }

        public Criteria andVpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vp_id not between", value1, value2, "vpId");
            return (Criteria) this;
        }

        public Criteria andPreNameIsNull() {
            addCriterion("pre_name is null");
            return (Criteria) this;
        }

        public Criteria andPreNameIsNotNull() {
            addCriterion("pre_name is not null");
            return (Criteria) this;
        }

        public Criteria andPreNameEqualTo(String value) {
            addCriterion("pre_name =", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotEqualTo(String value) {
            addCriterion("pre_name <>", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameGreaterThan(String value) {
            addCriterion("pre_name >", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameGreaterThanOrEqualTo(String value) {
            addCriterion("pre_name >=", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameLessThan(String value) {
            addCriterion("pre_name <", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameLessThanOrEqualTo(String value) {
            addCriterion("pre_name <=", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameLike(String value) {
            addCriterion("pre_name like", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotLike(String value) {
            addCriterion("pre_name not like", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameIn(List<String> values) {
            addCriterion("pre_name in", values, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotIn(List<String> values) {
            addCriterion("pre_name not in", values, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameBetween(String value1, String value2) {
            addCriterion("pre_name between", value1, value2, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotBetween(String value1, String value2) {
            addCriterion("pre_name not between", value1, value2, "preName");
            return (Criteria) this;
        }

        public Criteria andVpVIdIsNull() {
            addCriterion("vp_v_id is null");
            return (Criteria) this;
        }

        public Criteria andVpVIdIsNotNull() {
            addCriterion("vp_v_id is not null");
            return (Criteria) this;
        }

        public Criteria andVpVIdEqualTo(Integer value) {
            addCriterion("vp_v_id =", value, "vpVId");
            return (Criteria) this;
        }

        public Criteria andVpVIdNotEqualTo(Integer value) {
            addCriterion("vp_v_id <>", value, "vpVId");
            return (Criteria) this;
        }

        public Criteria andVpVIdGreaterThan(Integer value) {
            addCriterion("vp_v_id >", value, "vpVId");
            return (Criteria) this;
        }

        public Criteria andVpVIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vp_v_id >=", value, "vpVId");
            return (Criteria) this;
        }

        public Criteria andVpVIdLessThan(Integer value) {
            addCriterion("vp_v_id <", value, "vpVId");
            return (Criteria) this;
        }

        public Criteria andVpVIdLessThanOrEqualTo(Integer value) {
            addCriterion("vp_v_id <=", value, "vpVId");
            return (Criteria) this;
        }

        public Criteria andVpVIdIn(List<Integer> values) {
            addCriterion("vp_v_id in", values, "vpVId");
            return (Criteria) this;
        }

        public Criteria andVpVIdNotIn(List<Integer> values) {
            addCriterion("vp_v_id not in", values, "vpVId");
            return (Criteria) this;
        }

        public Criteria andVpVIdBetween(Integer value1, Integer value2) {
            addCriterion("vp_v_id between", value1, value2, "vpVId");
            return (Criteria) this;
        }

        public Criteria andVpVIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vp_v_id not between", value1, value2, "vpVId");
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