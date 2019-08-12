package com.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class DetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailsExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andCnNameIsNull() {
            addCriterion("cn_name is null");
            return (Criteria) this;
        }

        public Criteria andCnNameIsNotNull() {
            addCriterion("cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnNameEqualTo(String value) {
            addCriterion("cn_name =", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotEqualTo(String value) {
            addCriterion("cn_name <>", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThan(String value) {
            addCriterion("cn_name >", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_name >=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThan(String value) {
            addCriterion("cn_name <", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThanOrEqualTo(String value) {
            addCriterion("cn_name <=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLike(String value) {
            addCriterion("cn_name like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotLike(String value) {
            addCriterion("cn_name not like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameIn(List<String> values) {
            addCriterion("cn_name in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotIn(List<String> values) {
            addCriterion("cn_name not in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameBetween(String value1, String value2) {
            addCriterion("cn_name between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotBetween(String value1, String value2) {
            addCriterion("cn_name not between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameIsNull() {
            addCriterion("aliases_name is null");
            return (Criteria) this;
        }

        public Criteria andAliasesNameIsNotNull() {
            addCriterion("aliases_name is not null");
            return (Criteria) this;
        }

        public Criteria andAliasesNameEqualTo(String value) {
            addCriterion("aliases_name =", value, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameNotEqualTo(String value) {
            addCriterion("aliases_name <>", value, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameGreaterThan(String value) {
            addCriterion("aliases_name >", value, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameGreaterThanOrEqualTo(String value) {
            addCriterion("aliases_name >=", value, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameLessThan(String value) {
            addCriterion("aliases_name <", value, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameLessThanOrEqualTo(String value) {
            addCriterion("aliases_name <=", value, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameLike(String value) {
            addCriterion("aliases_name like", value, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameNotLike(String value) {
            addCriterion("aliases_name not like", value, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameIn(List<String> values) {
            addCriterion("aliases_name in", values, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameNotIn(List<String> values) {
            addCriterion("aliases_name not in", values, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameBetween(String value1, String value2) {
            addCriterion("aliases_name between", value1, value2, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andAliasesNameNotBetween(String value1, String value2) {
            addCriterion("aliases_name not between", value1, value2, "aliasesName");
            return (Criteria) this;
        }

        public Criteria andStructureIsNull() {
            addCriterion("structure is null");
            return (Criteria) this;
        }

        public Criteria andStructureIsNotNull() {
            addCriterion("structure is not null");
            return (Criteria) this;
        }

        public Criteria andStructureEqualTo(String value) {
            addCriterion("structure =", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotEqualTo(String value) {
            addCriterion("structure <>", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThan(String value) {
            addCriterion("structure >", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThanOrEqualTo(String value) {
            addCriterion("structure >=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThan(String value) {
            addCriterion("structure <", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThanOrEqualTo(String value) {
            addCriterion("structure <=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLike(String value) {
            addCriterion("structure like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotLike(String value) {
            addCriterion("structure not like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureIn(List<String> values) {
            addCriterion("structure in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotIn(List<String> values) {
            addCriterion("structure not in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureBetween(String value1, String value2) {
            addCriterion("structure between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotBetween(String value1, String value2) {
            addCriterion("structure not between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNull() {
            addCriterion("performance is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNotNull() {
            addCriterion("performance is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceEqualTo(String value) {
            addCriterion("performance =", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotEqualTo(String value) {
            addCriterion("performance <>", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThan(String value) {
            addCriterion("performance >", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("performance >=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThan(String value) {
            addCriterion("performance <", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThanOrEqualTo(String value) {
            addCriterion("performance <=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLike(String value) {
            addCriterion("performance like", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotLike(String value) {
            addCriterion("performance not like", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceIn(List<String> values) {
            addCriterion("performance in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotIn(List<String> values) {
            addCriterion("performance not in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceBetween(String value1, String value2) {
            addCriterion("performance between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotBetween(String value1, String value2) {
            addCriterion("performance not between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNull() {
            addCriterion("technology is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNotNull() {
            addCriterion("technology is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyEqualTo(String value) {
            addCriterion("technology =", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotEqualTo(String value) {
            addCriterion("technology <>", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThan(String value) {
            addCriterion("technology >", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("technology >=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThan(String value) {
            addCriterion("technology <", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThanOrEqualTo(String value) {
            addCriterion("technology <=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLike(String value) {
            addCriterion("technology like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotLike(String value) {
            addCriterion("technology not like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyIn(List<String> values) {
            addCriterion("technology in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotIn(List<String> values) {
            addCriterion("technology not in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyBetween(String value1, String value2) {
            addCriterion("technology between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotBetween(String value1, String value2) {
            addCriterion("technology not between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("reg_id is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("reg_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(Integer value) {
            addCriterion("reg_id =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(Integer value) {
            addCriterion("reg_id <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(Integer value) {
            addCriterion("reg_id >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_id >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(Integer value) {
            addCriterion("reg_id <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(Integer value) {
            addCriterion("reg_id <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<Integer> values) {
            addCriterion("reg_id in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<Integer> values) {
            addCriterion("reg_id not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(Integer value1, Integer value2) {
            addCriterion("reg_id between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_id not between", value1, value2, "regId");
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