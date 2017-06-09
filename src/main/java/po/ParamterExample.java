package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ParamterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParamterExample() {
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

        public Criteria andParamterIdIsNull() {
            addCriterion("paramter_id is null");
            return (Criteria) this;
        }

        public Criteria andParamterIdIsNotNull() {
            addCriterion("paramter_id is not null");
            return (Criteria) this;
        }

        public Criteria andParamterIdEqualTo(Integer value) {
            addCriterion("paramter_id =", value, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamterIdNotEqualTo(Integer value) {
            addCriterion("paramter_id <>", value, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamterIdGreaterThan(Integer value) {
            addCriterion("paramter_id >", value, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paramter_id >=", value, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamterIdLessThan(Integer value) {
            addCriterion("paramter_id <", value, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamterIdLessThanOrEqualTo(Integer value) {
            addCriterion("paramter_id <=", value, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamterIdIn(List<Integer> values) {
            addCriterion("paramter_id in", values, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamterIdNotIn(List<Integer> values) {
            addCriterion("paramter_id not in", values, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamterIdBetween(Integer value1, Integer value2) {
            addCriterion("paramter_id between", value1, value2, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paramter_id not between", value1, value2, "paramterId");
            return (Criteria) this;
        }

        public Criteria andParamenterName1IsNull() {
            addCriterion("paramenter_name1 is null");
            return (Criteria) this;
        }

        public Criteria andParamenterName1IsNotNull() {
            addCriterion("paramenter_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andParamenterName1EqualTo(String value) {
            addCriterion("paramenter_name1 =", value, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1NotEqualTo(String value) {
            addCriterion("paramenter_name1 <>", value, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1GreaterThan(String value) {
            addCriterion("paramenter_name1 >", value, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1GreaterThanOrEqualTo(String value) {
            addCriterion("paramenter_name1 >=", value, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1LessThan(String value) {
            addCriterion("paramenter_name1 <", value, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1LessThanOrEqualTo(String value) {
            addCriterion("paramenter_name1 <=", value, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1Like(String value) {
            addCriterion("paramenter_name1 like", value, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1NotLike(String value) {
            addCriterion("paramenter_name1 not like", value, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1In(List<String> values) {
            addCriterion("paramenter_name1 in", values, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1NotIn(List<String> values) {
            addCriterion("paramenter_name1 not in", values, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1Between(String value1, String value2) {
            addCriterion("paramenter_name1 between", value1, value2, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName1NotBetween(String value1, String value2) {
            addCriterion("paramenter_name1 not between", value1, value2, "paramenterName1");
            return (Criteria) this;
        }

        public Criteria andParamenterName2IsNull() {
            addCriterion("paramenter_name2 is null");
            return (Criteria) this;
        }

        public Criteria andParamenterName2IsNotNull() {
            addCriterion("paramenter_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andParamenterName2EqualTo(String value) {
            addCriterion("paramenter_name2 =", value, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2NotEqualTo(String value) {
            addCriterion("paramenter_name2 <>", value, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2GreaterThan(String value) {
            addCriterion("paramenter_name2 >", value, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2GreaterThanOrEqualTo(String value) {
            addCriterion("paramenter_name2 >=", value, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2LessThan(String value) {
            addCriterion("paramenter_name2 <", value, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2LessThanOrEqualTo(String value) {
            addCriterion("paramenter_name2 <=", value, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2Like(String value) {
            addCriterion("paramenter_name2 like", value, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2NotLike(String value) {
            addCriterion("paramenter_name2 not like", value, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2In(List<String> values) {
            addCriterion("paramenter_name2 in", values, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2NotIn(List<String> values) {
            addCriterion("paramenter_name2 not in", values, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2Between(String value1, String value2) {
            addCriterion("paramenter_name2 between", value1, value2, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName2NotBetween(String value1, String value2) {
            addCriterion("paramenter_name2 not between", value1, value2, "paramenterName2");
            return (Criteria) this;
        }

        public Criteria andParamenterName3IsNull() {
            addCriterion("paramenter_name3 is null");
            return (Criteria) this;
        }

        public Criteria andParamenterName3IsNotNull() {
            addCriterion("paramenter_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andParamenterName3EqualTo(String value) {
            addCriterion("paramenter_name3 =", value, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3NotEqualTo(String value) {
            addCriterion("paramenter_name3 <>", value, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3GreaterThan(String value) {
            addCriterion("paramenter_name3 >", value, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3GreaterThanOrEqualTo(String value) {
            addCriterion("paramenter_name3 >=", value, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3LessThan(String value) {
            addCriterion("paramenter_name3 <", value, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3LessThanOrEqualTo(String value) {
            addCriterion("paramenter_name3 <=", value, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3Like(String value) {
            addCriterion("paramenter_name3 like", value, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3NotLike(String value) {
            addCriterion("paramenter_name3 not like", value, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3In(List<String> values) {
            addCriterion("paramenter_name3 in", values, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3NotIn(List<String> values) {
            addCriterion("paramenter_name3 not in", values, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3Between(String value1, String value2) {
            addCriterion("paramenter_name3 between", value1, value2, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName3NotBetween(String value1, String value2) {
            addCriterion("paramenter_name3 not between", value1, value2, "paramenterName3");
            return (Criteria) this;
        }

        public Criteria andParamenterName4IsNull() {
            addCriterion("paramenter_name4 is null");
            return (Criteria) this;
        }

        public Criteria andParamenterName4IsNotNull() {
            addCriterion("paramenter_name4 is not null");
            return (Criteria) this;
        }

        public Criteria andParamenterName4EqualTo(String value) {
            addCriterion("paramenter_name4 =", value, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4NotEqualTo(String value) {
            addCriterion("paramenter_name4 <>", value, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4GreaterThan(String value) {
            addCriterion("paramenter_name4 >", value, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4GreaterThanOrEqualTo(String value) {
            addCriterion("paramenter_name4 >=", value, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4LessThan(String value) {
            addCriterion("paramenter_name4 <", value, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4LessThanOrEqualTo(String value) {
            addCriterion("paramenter_name4 <=", value, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4Like(String value) {
            addCriterion("paramenter_name4 like", value, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4NotLike(String value) {
            addCriterion("paramenter_name4 not like", value, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4In(List<String> values) {
            addCriterion("paramenter_name4 in", values, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4NotIn(List<String> values) {
            addCriterion("paramenter_name4 not in", values, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4Between(String value1, String value2) {
            addCriterion("paramenter_name4 between", value1, value2, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName4NotBetween(String value1, String value2) {
            addCriterion("paramenter_name4 not between", value1, value2, "paramenterName4");
            return (Criteria) this;
        }

        public Criteria andParamenterName5IsNull() {
            addCriterion("paramenter_name5 is null");
            return (Criteria) this;
        }

        public Criteria andParamenterName5IsNotNull() {
            addCriterion("paramenter_name5 is not null");
            return (Criteria) this;
        }

        public Criteria andParamenterName5EqualTo(String value) {
            addCriterion("paramenter_name5 =", value, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5NotEqualTo(String value) {
            addCriterion("paramenter_name5 <>", value, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5GreaterThan(String value) {
            addCriterion("paramenter_name5 >", value, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5GreaterThanOrEqualTo(String value) {
            addCriterion("paramenter_name5 >=", value, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5LessThan(String value) {
            addCriterion("paramenter_name5 <", value, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5LessThanOrEqualTo(String value) {
            addCriterion("paramenter_name5 <=", value, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5Like(String value) {
            addCriterion("paramenter_name5 like", value, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5NotLike(String value) {
            addCriterion("paramenter_name5 not like", value, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5In(List<String> values) {
            addCriterion("paramenter_name5 in", values, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5NotIn(List<String> values) {
            addCriterion("paramenter_name5 not in", values, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5Between(String value1, String value2) {
            addCriterion("paramenter_name5 between", value1, value2, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andParamenterName5NotBetween(String value1, String value2) {
            addCriterion("paramenter_name5 not between", value1, value2, "paramenterName5");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNull() {
            addCriterion("special is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIsNotNull() {
            addCriterion("special is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialEqualTo(String value) {
            addCriterion("special =", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotEqualTo(String value) {
            addCriterion("special <>", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThan(String value) {
            addCriterion("special >", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("special >=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThan(String value) {
            addCriterion("special <", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLessThanOrEqualTo(String value) {
            addCriterion("special <=", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialLike(String value) {
            addCriterion("special like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotLike(String value) {
            addCriterion("special not like", value, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialIn(List<String> values) {
            addCriterion("special in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotIn(List<String> values) {
            addCriterion("special not in", values, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialBetween(String value1, String value2) {
            addCriterion("special between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andSpecialNotBetween(String value1, String value2) {
            addCriterion("special not between", value1, value2, "special");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterionForJDBCDate("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterionForJDBCDate("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterionForJDBCDate("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveIsNull() {
            addCriterion("effective is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveIsNotNull() {
            addCriterion("effective is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEqualTo(Integer value) {
            addCriterion("effective =", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotEqualTo(Integer value) {
            addCriterion("effective <>", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveGreaterThan(Integer value) {
            addCriterion("effective >", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("effective >=", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLessThan(Integer value) {
            addCriterion("effective <", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveLessThanOrEqualTo(Integer value) {
            addCriterion("effective <=", value, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveIn(List<Integer> values) {
            addCriterion("effective in", values, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotIn(List<Integer> values) {
            addCriterion("effective not in", values, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveBetween(Integer value1, Integer value2) {
            addCriterion("effective between", value1, value2, "effective");
            return (Criteria) this;
        }

        public Criteria andEffectiveNotBetween(Integer value1, Integer value2) {
            addCriterion("effective not between", value1, value2, "effective");
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