package po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotesExample() {
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

        public Criteria andNotesIdIsNull() {
            addCriterion("notes_id is null");
            return (Criteria) this;
        }

        public Criteria andNotesIdIsNotNull() {
            addCriterion("notes_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotesIdEqualTo(String value) {
            addCriterion("notes_id =", value, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdNotEqualTo(String value) {
            addCriterion("notes_id <>", value, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdGreaterThan(String value) {
            addCriterion("notes_id >", value, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdGreaterThanOrEqualTo(String value) {
            addCriterion("notes_id >=", value, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdLessThan(String value) {
            addCriterion("notes_id <", value, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdLessThanOrEqualTo(String value) {
            addCriterion("notes_id <=", value, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdLike(String value) {
            addCriterion("notes_id like", value, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdNotLike(String value) {
            addCriterion("notes_id not like", value, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdIn(List<String> values) {
            addCriterion("notes_id in", values, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdNotIn(List<String> values) {
            addCriterion("notes_id not in", values, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdBetween(String value1, String value2) {
            addCriterion("notes_id between", value1, value2, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesIdNotBetween(String value1, String value2) {
            addCriterion("notes_id not between", value1, value2, "notesId");
            return (Criteria) this;
        }

        public Criteria andNotesTitleIsNull() {
            addCriterion("notes_title is null");
            return (Criteria) this;
        }

        public Criteria andNotesTitleIsNotNull() {
            addCriterion("notes_title is not null");
            return (Criteria) this;
        }

        public Criteria andNotesTitleEqualTo(String value) {
            addCriterion("notes_title =", value, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleNotEqualTo(String value) {
            addCriterion("notes_title <>", value, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleGreaterThan(String value) {
            addCriterion("notes_title >", value, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notes_title >=", value, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleLessThan(String value) {
            addCriterion("notes_title <", value, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleLessThanOrEqualTo(String value) {
            addCriterion("notes_title <=", value, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleLike(String value) {
            addCriterion("notes_title like", value, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleNotLike(String value) {
            addCriterion("notes_title not like", value, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleIn(List<String> values) {
            addCriterion("notes_title in", values, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleNotIn(List<String> values) {
            addCriterion("notes_title not in", values, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleBetween(String value1, String value2) {
            addCriterion("notes_title between", value1, value2, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesTitleNotBetween(String value1, String value2) {
            addCriterion("notes_title not between", value1, value2, "notesTitle");
            return (Criteria) this;
        }

        public Criteria andNotesContentIsNull() {
            addCriterion("notes_content is null");
            return (Criteria) this;
        }

        public Criteria andNotesContentIsNotNull() {
            addCriterion("notes_content is not null");
            return (Criteria) this;
        }

        public Criteria andNotesContentEqualTo(String value) {
            addCriterion("notes_content =", value, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentNotEqualTo(String value) {
            addCriterion("notes_content <>", value, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentGreaterThan(String value) {
            addCriterion("notes_content >", value, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentGreaterThanOrEqualTo(String value) {
            addCriterion("notes_content >=", value, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentLessThan(String value) {
            addCriterion("notes_content <", value, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentLessThanOrEqualTo(String value) {
            addCriterion("notes_content <=", value, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentLike(String value) {
            addCriterion("notes_content like", value, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentNotLike(String value) {
            addCriterion("notes_content not like", value, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentIn(List<String> values) {
            addCriterion("notes_content in", values, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentNotIn(List<String> values) {
            addCriterion("notes_content not in", values, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentBetween(String value1, String value2) {
            addCriterion("notes_content between", value1, value2, "notesContent");
            return (Criteria) this;
        }

        public Criteria andNotesContentNotBetween(String value1, String value2) {
            addCriterion("notes_content not between", value1, value2, "notesContent");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
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