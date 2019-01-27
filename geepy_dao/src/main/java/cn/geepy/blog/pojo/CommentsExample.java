package cn.geepy.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterionForJDBCDate("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterionForJDBCDate("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterionForJDBCDate("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterionForJDBCDate("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterionForJDBCDate("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterionForJDBCDate("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterionForJDBCDate("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterionForJDBCDate("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterionForJDBCDate("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterionForJDBCDate("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andComUIdIsNull() {
            addCriterion("com_u_id is null");
            return (Criteria) this;
        }

        public Criteria andComUIdIsNotNull() {
            addCriterion("com_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andComUIdEqualTo(Integer value) {
            addCriterion("com_u_id =", value, "comUId");
            return (Criteria) this;
        }

        public Criteria andComUIdNotEqualTo(Integer value) {
            addCriterion("com_u_id <>", value, "comUId");
            return (Criteria) this;
        }

        public Criteria andComUIdGreaterThan(Integer value) {
            addCriterion("com_u_id >", value, "comUId");
            return (Criteria) this;
        }

        public Criteria andComUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_u_id >=", value, "comUId");
            return (Criteria) this;
        }

        public Criteria andComUIdLessThan(Integer value) {
            addCriterion("com_u_id <", value, "comUId");
            return (Criteria) this;
        }

        public Criteria andComUIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_u_id <=", value, "comUId");
            return (Criteria) this;
        }

        public Criteria andComUIdIn(List<Integer> values) {
            addCriterion("com_u_id in", values, "comUId");
            return (Criteria) this;
        }

        public Criteria andComUIdNotIn(List<Integer> values) {
            addCriterion("com_u_id not in", values, "comUId");
            return (Criteria) this;
        }

        public Criteria andComUIdBetween(Integer value1, Integer value2) {
            addCriterion("com_u_id between", value1, value2, "comUId");
            return (Criteria) this;
        }

        public Criteria andComUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_u_id not between", value1, value2, "comUId");
            return (Criteria) this;
        }

        public Criteria andComAIdIsNull() {
            addCriterion("com_a_id is null");
            return (Criteria) this;
        }

        public Criteria andComAIdIsNotNull() {
            addCriterion("com_a_id is not null");
            return (Criteria) this;
        }

        public Criteria andComAIdEqualTo(Integer value) {
            addCriterion("com_a_id =", value, "comAId");
            return (Criteria) this;
        }

        public Criteria andComAIdNotEqualTo(Integer value) {
            addCriterion("com_a_id <>", value, "comAId");
            return (Criteria) this;
        }

        public Criteria andComAIdGreaterThan(Integer value) {
            addCriterion("com_a_id >", value, "comAId");
            return (Criteria) this;
        }

        public Criteria andComAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_a_id >=", value, "comAId");
            return (Criteria) this;
        }

        public Criteria andComAIdLessThan(Integer value) {
            addCriterion("com_a_id <", value, "comAId");
            return (Criteria) this;
        }

        public Criteria andComAIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_a_id <=", value, "comAId");
            return (Criteria) this;
        }

        public Criteria andComAIdIn(List<Integer> values) {
            addCriterion("com_a_id in", values, "comAId");
            return (Criteria) this;
        }

        public Criteria andComAIdNotIn(List<Integer> values) {
            addCriterion("com_a_id not in", values, "comAId");
            return (Criteria) this;
        }

        public Criteria andComAIdBetween(Integer value1, Integer value2) {
            addCriterion("com_a_id between", value1, value2, "comAId");
            return (Criteria) this;
        }

        public Criteria andComAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_a_id not between", value1, value2, "comAId");
            return (Criteria) this;
        }

        public Criteria andComCUdIsNull() {
            addCriterion("com_c_ud is null");
            return (Criteria) this;
        }

        public Criteria andComCUdIsNotNull() {
            addCriterion("com_c_ud is not null");
            return (Criteria) this;
        }

        public Criteria andComCUdEqualTo(Integer value) {
            addCriterion("com_c_ud =", value, "comCUd");
            return (Criteria) this;
        }

        public Criteria andComCUdNotEqualTo(Integer value) {
            addCriterion("com_c_ud <>", value, "comCUd");
            return (Criteria) this;
        }

        public Criteria andComCUdGreaterThan(Integer value) {
            addCriterion("com_c_ud >", value, "comCUd");
            return (Criteria) this;
        }

        public Criteria andComCUdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_c_ud >=", value, "comCUd");
            return (Criteria) this;
        }

        public Criteria andComCUdLessThan(Integer value) {
            addCriterion("com_c_ud <", value, "comCUd");
            return (Criteria) this;
        }

        public Criteria andComCUdLessThanOrEqualTo(Integer value) {
            addCriterion("com_c_ud <=", value, "comCUd");
            return (Criteria) this;
        }

        public Criteria andComCUdIn(List<Integer> values) {
            addCriterion("com_c_ud in", values, "comCUd");
            return (Criteria) this;
        }

        public Criteria andComCUdNotIn(List<Integer> values) {
            addCriterion("com_c_ud not in", values, "comCUd");
            return (Criteria) this;
        }

        public Criteria andComCUdBetween(Integer value1, Integer value2) {
            addCriterion("com_c_ud between", value1, value2, "comCUd");
            return (Criteria) this;
        }

        public Criteria andComCUdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_c_ud not between", value1, value2, "comCUd");
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