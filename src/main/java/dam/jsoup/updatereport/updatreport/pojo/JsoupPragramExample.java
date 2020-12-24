package dam.jsoup.updatereport.updatreport.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  dam
 * @date  2020/12/23 10:24
 * @version 1.0
 */
public class JsoupPragramExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JsoupPragramExample() {
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

        public Criteria andPragramIdIsNull() {
            addCriterion("pragram_id is null");
            return (Criteria) this;
        }

        public Criteria andPragramIdIsNotNull() {
            addCriterion("pragram_id is not null");
            return (Criteria) this;
        }

        public Criteria andPragramIdEqualTo(Integer value) {
            addCriterion("pragram_id =", value, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramIdNotEqualTo(Integer value) {
            addCriterion("pragram_id <>", value, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramIdGreaterThan(Integer value) {
            addCriterion("pragram_id >", value, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pragram_id >=", value, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramIdLessThan(Integer value) {
            addCriterion("pragram_id <", value, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramIdLessThanOrEqualTo(Integer value) {
            addCriterion("pragram_id <=", value, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramIdIn(List<Integer> values) {
            addCriterion("pragram_id in", values, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramIdNotIn(List<Integer> values) {
            addCriterion("pragram_id not in", values, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramIdBetween(Integer value1, Integer value2) {
            addCriterion("pragram_id between", value1, value2, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pragram_id not between", value1, value2, "pragramId");
            return (Criteria) this;
        }

        public Criteria andPragramValueIsNull() {
            addCriterion("pragram_value is null");
            return (Criteria) this;
        }

        public Criteria andPragramValueIsNotNull() {
            addCriterion("pragram_value is not null");
            return (Criteria) this;
        }

        public Criteria andPragramValueEqualTo(String value) {
            addCriterion("pragram_value =", value, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueNotEqualTo(String value) {
            addCriterion("pragram_value <>", value, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueGreaterThan(String value) {
            addCriterion("pragram_value >", value, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueGreaterThanOrEqualTo(String value) {
            addCriterion("pragram_value >=", value, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueLessThan(String value) {
            addCriterion("pragram_value <", value, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueLessThanOrEqualTo(String value) {
            addCriterion("pragram_value <=", value, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueLike(String value) {
            addCriterion("pragram_value like", value, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueNotLike(String value) {
            addCriterion("pragram_value not like", value, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueIn(List<String> values) {
            addCriterion("pragram_value in", values, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueNotIn(List<String> values) {
            addCriterion("pragram_value not in", values, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueBetween(String value1, String value2) {
            addCriterion("pragram_value between", value1, value2, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andPragramValueNotBetween(String value1, String value2) {
            addCriterion("pragram_value not between", value1, value2, "pragramValue");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNull() {
            addCriterion("mission_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNotNull() {
            addCriterion("mission_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIdEqualTo(Integer value) {
            addCriterion("mission_id =", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotEqualTo(Integer value) {
            addCriterion("mission_id <>", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThan(Integer value) {
            addCriterion("mission_id >", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mission_id >=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThan(Integer value) {
            addCriterion("mission_id <", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("mission_id <=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdIn(List<Integer> values) {
            addCriterion("mission_id in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotIn(List<Integer> values) {
            addCriterion("mission_id not in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdBetween(Integer value1, Integer value2) {
            addCriterion("mission_id between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mission_id not between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNull() {
            addCriterion("action_id is null");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("action_id is not null");
            return (Criteria) this;
        }

        public Criteria andActionIdEqualTo(Integer value) {
            addCriterion("action_id =", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotEqualTo(Integer value) {
            addCriterion("action_id <>", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThan(Integer value) {
            addCriterion("action_id >", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_id >=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThan(Integer value) {
            addCriterion("action_id <", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThanOrEqualTo(Integer value) {
            addCriterion("action_id <=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdIn(List<Integer> values) {
            addCriterion("action_id in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotIn(List<Integer> values) {
            addCriterion("action_id not in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdBetween(Integer value1, Integer value2) {
            addCriterion("action_id between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("action_id not between", value1, value2, "actionId");
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