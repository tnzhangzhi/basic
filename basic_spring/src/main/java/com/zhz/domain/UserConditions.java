package com.zhz.domain;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserConditions {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Date shardDate;

    public UserConditions() {
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

    public void setShardDate(Date shardDate) {
        this.shardDate = shardDate;
    }

    public Date getShardDate() {
        return this.shardDate;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Integer value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Integer value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Integer value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Integer value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Integer> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Integer> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Integer value1, Integer value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Boolean value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Boolean value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Boolean value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Boolean value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Boolean> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Boolean> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andListenTimeIsNull() {
            addCriterion("listen_time is null");
            return (Criteria) this;
        }

        public Criteria andListenTimeIsNotNull() {
            addCriterion("listen_time is not null");
            return (Criteria) this;
        }

        public Criteria andListenTimeEqualTo(Long value) {
            addCriterion("listen_time =", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeNotEqualTo(Long value) {
            addCriterion("listen_time <>", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeGreaterThan(Long value) {
            addCriterion("listen_time >", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("listen_time >=", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeLessThan(Long value) {
            addCriterion("listen_time <", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeLessThanOrEqualTo(Long value) {
            addCriterion("listen_time <=", value, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeIn(List<Long> values) {
            addCriterion("listen_time in", values, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeNotIn(List<Long> values) {
            addCriterion("listen_time not in", values, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeBetween(Long value1, Long value2) {
            addCriterion("listen_time between", value1, value2, "listenTime");
            return (Criteria) this;
        }

        public Criteria andListenTimeNotBetween(Long value1, Long value2) {
            addCriterion("listen_time not between", value1, value2, "listenTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("lastlogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("lastlogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Date value) {
            addCriterion("lastlogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Date value) {
            addCriterion("lastlogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Date value) {
            addCriterion("lastlogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("lastlogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Date value) {
            addCriterion("lastlogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Date value) {
            addCriterion("lastlogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Date> values) {
            addCriterion("lastlogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Date> values) {
            addCriterion("lastlogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Date value1, Date value2) {
            addCriterion("lastlogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Date value1, Date value2) {
            addCriterion("lastlogin not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLogintimesIsNull() {
            addCriterion("logintimes is null");
            return (Criteria) this;
        }

        public Criteria andLogintimesIsNotNull() {
            addCriterion("logintimes is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimesEqualTo(Integer value) {
            addCriterion("logintimes =", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesNotEqualTo(Integer value) {
            addCriterion("logintimes <>", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesGreaterThan(Integer value) {
            addCriterion("logintimes >", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("logintimes >=", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesLessThan(Integer value) {
            addCriterion("logintimes <", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesLessThanOrEqualTo(Integer value) {
            addCriterion("logintimes <=", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesIn(List<Integer> values) {
            addCriterion("logintimes in", values, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesNotIn(List<Integer> values) {
            addCriterion("logintimes not in", values, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesBetween(Integer value1, Integer value2) {
            addCriterion("logintimes between", value1, value2, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesNotBetween(Integer value1, Integer value2) {
            addCriterion("logintimes not between", value1, value2, "logintimes");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andRegistIpIsNull() {
            addCriterion("regist_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegistIpIsNotNull() {
            addCriterion("regist_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegistIpEqualTo(String value) {
            addCriterion("regist_ip =", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpNotEqualTo(String value) {
            addCriterion("regist_ip <>", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpGreaterThan(String value) {
            addCriterion("regist_ip >", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpGreaterThanOrEqualTo(String value) {
            addCriterion("regist_ip >=", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpLessThan(String value) {
            addCriterion("regist_ip <", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpLessThanOrEqualTo(String value) {
            addCriterion("regist_ip <=", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpLike(String value) {
            addCriterion("regist_ip like", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpNotLike(String value) {
            addCriterion("regist_ip not like", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpIn(List<String> values) {
            addCriterion("regist_ip in", values, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpNotIn(List<String> values) {
            addCriterion("regist_ip not in", values, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpBetween(String value1, String value2) {
            addCriterion("regist_ip between", value1, value2, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpNotBetween(String value1, String value2) {
            addCriterion("regist_ip not between", value1, value2, "registIp");
            return (Criteria) this;
        }

        public Criteria andUserKeyIsNull() {
            addCriterion("user_key is null");
            return (Criteria) this;
        }

        public Criteria andUserKeyIsNotNull() {
            addCriterion("user_key is not null");
            return (Criteria) this;
        }

        public Criteria andUserKeyEqualTo(String value) {
            addCriterion("user_key =", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotEqualTo(String value) {
            addCriterion("user_key <>", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThan(String value) {
            addCriterion("user_key >", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThanOrEqualTo(String value) {
            addCriterion("user_key >=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThan(String value) {
            addCriterion("user_key <", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThanOrEqualTo(String value) {
            addCriterion("user_key <=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLike(String value) {
            addCriterion("user_key like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotLike(String value) {
            addCriterion("user_key not like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyIn(List<String> values) {
            addCriterion("user_key in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotIn(List<String> values) {
            addCriterion("user_key not in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyBetween(String value1, String value2) {
            addCriterion("user_key between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotBetween(String value1, String value2) {
            addCriterion("user_key not between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIsNull() {
            addCriterion("refresh_feeds_at is null");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIsNotNull() {
            addCriterion("refresh_feeds_at is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtEqualTo(Date value) {
            addCriterion("refresh_feeds_at =", value, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtNotEqualTo(Date value) {
            addCriterion("refresh_feeds_at <>", value, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtGreaterThan(Date value) {
            addCriterion("refresh_feeds_at >", value, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtGreaterThanOrEqualTo(Date value) {
            addCriterion("refresh_feeds_at >=", value, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtLessThan(Date value) {
            addCriterion("refresh_feeds_at <", value, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtLessThanOrEqualTo(Date value) {
            addCriterion("refresh_feeds_at <=", value, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIn(List<Date> values) {
            addCriterion("refresh_feeds_at in", values, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtNotIn(List<Date> values) {
            addCriterion("refresh_feeds_at not in", values, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtBetween(Date value1, Date value2) {
            addCriterion("refresh_feeds_at between", value1, value2, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtNotBetween(Date value1, Date value2) {
            addCriterion("refresh_feeds_at not between", value1, value2, "refreshFeedsAt");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdIsNull() {
            addCriterion("refresh_feeds_at_id is null");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdIsNotNull() {
            addCriterion("refresh_feeds_at_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdEqualTo(Long value) {
            addCriterion("refresh_feeds_at_id =", value, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdNotEqualTo(Long value) {
            addCriterion("refresh_feeds_at_id <>", value, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdGreaterThan(Long value) {
            addCriterion("refresh_feeds_at_id >", value, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("refresh_feeds_at_id >=", value, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdLessThan(Long value) {
            addCriterion("refresh_feeds_at_id <", value, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdLessThanOrEqualTo(Long value) {
            addCriterion("refresh_feeds_at_id <=", value, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdIn(List<Long> values) {
            addCriterion("refresh_feeds_at_id in", values, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdNotIn(List<Long> values) {
            addCriterion("refresh_feeds_at_id not in", values, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdBetween(Long value1, Long value2) {
            addCriterion("refresh_feeds_at_id between", value1, value2, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andRefreshFeedsAtIdNotBetween(Long value1, Long value2) {
            addCriterion("refresh_feeds_at_id not between", value1, value2, "refreshFeedsAtId");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryIsNull() {
            addCriterion("is_subscribe_category is null");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryIsNotNull() {
            addCriterion("is_subscribe_category is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryEqualTo(Integer value) {
            addCriterion("is_subscribe_category =", value, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryNotEqualTo(Integer value) {
            addCriterion("is_subscribe_category <>", value, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryGreaterThan(Integer value) {
            addCriterion("is_subscribe_category >", value, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_subscribe_category >=", value, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryLessThan(Integer value) {
            addCriterion("is_subscribe_category <", value, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("is_subscribe_category <=", value, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryIn(List<Integer> values) {
            addCriterion("is_subscribe_category in", values, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryNotIn(List<Integer> values) {
            addCriterion("is_subscribe_category not in", values, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryBetween(Integer value1, Integer value2) {
            addCriterion("is_subscribe_category between", value1, value2, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsSubscribeCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("is_subscribe_category not between", value1, value2, "isSubscribeCategory");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterIsNull() {
            addCriterion("is_podcaster is null");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterIsNotNull() {
            addCriterion("is_podcaster is not null");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterEqualTo(Integer value) {
            addCriterion("is_podcaster =", value, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterNotEqualTo(Integer value) {
            addCriterion("is_podcaster <>", value, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterGreaterThan(Integer value) {
            addCriterion("is_podcaster >", value, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_podcaster >=", value, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterLessThan(Integer value) {
            addCriterion("is_podcaster <", value, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterLessThanOrEqualTo(Integer value) {
            addCriterion("is_podcaster <=", value, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterIn(List<Integer> values) {
            addCriterion("is_podcaster in", values, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterNotIn(List<Integer> values) {
            addCriterion("is_podcaster not in", values, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterBetween(Integer value1, Integer value2) {
            addCriterion("is_podcaster between", value1, value2, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsPodcasterNotBetween(Integer value1, Integer value2) {
            addCriterion("is_podcaster not between", value1, value2, "isPodcaster");
            return (Criteria) this;
        }

        public Criteria andIsVIsNull() {
            addCriterion("is_v is null");
            return (Criteria) this;
        }

        public Criteria andIsVIsNotNull() {
            addCriterion("is_v is not null");
            return (Criteria) this;
        }

        public Criteria andIsVEqualTo(Integer value) {
            addCriterion("is_v =", value, "isV");
            return (Criteria) this;
        }

        public Criteria andIsVNotEqualTo(Integer value) {
            addCriterion("is_v <>", value, "isV");
            return (Criteria) this;
        }

        public Criteria andIsVGreaterThan(Integer value) {
            addCriterion("is_v >", value, "isV");
            return (Criteria) this;
        }

        public Criteria andIsVGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_v >=", value, "isV");
            return (Criteria) this;
        }

        public Criteria andIsVLessThan(Integer value) {
            addCriterion("is_v <", value, "isV");
            return (Criteria) this;
        }

        public Criteria andIsVLessThanOrEqualTo(Integer value) {
            addCriterion("is_v <=", value, "isV");
            return (Criteria) this;
        }

        public Criteria andIsVIn(List<Integer> values) {
            addCriterion("is_v in", values, "isV");
            return (Criteria) this;
        }

        public Criteria andIsVNotIn(List<Integer> values) {
            addCriterion("is_v not in", values, "isV");
            return (Criteria) this;
        }

        public Criteria andIsVBetween(Integer value1, Integer value2) {
            addCriterion("is_v between", value1, value2, "isV");
            return (Criteria) this;
        }

        public Criteria andIsVNotBetween(Integer value1, Integer value2) {
            addCriterion("is_v not between", value1, value2, "isV");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andUserTokenIsNull() {
            addCriterion("user_token is null");
            return (Criteria) this;
        }

        public Criteria andUserTokenIsNotNull() {
            addCriterion("user_token is not null");
            return (Criteria) this;
        }

        public Criteria andUserTokenEqualTo(String value) {
            addCriterion("user_token =", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotEqualTo(String value) {
            addCriterion("user_token <>", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThan(String value) {
            addCriterion("user_token >", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThanOrEqualTo(String value) {
            addCriterion("user_token >=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThan(String value) {
            addCriterion("user_token <", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThanOrEqualTo(String value) {
            addCriterion("user_token <=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLike(String value) {
            addCriterion("user_token like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotLike(String value) {
            addCriterion("user_token not like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenIn(List<String> values) {
            addCriterion("user_token in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotIn(List<String> values) {
            addCriterion("user_token not in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenBetween(String value1, String value2) {
            addCriterion("user_token between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotBetween(String value1, String value2) {
            addCriterion("user_token not between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Integer value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Integer value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Integer value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Integer value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Integer value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Integer> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Integer> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Integer value1, Integer value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("user_state not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andRegTypeIsNull() {
            addCriterion("reg_type is null");
            return (Criteria) this;
        }

        public Criteria andRegTypeIsNotNull() {
            addCriterion("reg_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegTypeEqualTo(String value) {
            addCriterion("reg_type =", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotEqualTo(String value) {
            addCriterion("reg_type <>", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThan(String value) {
            addCriterion("reg_type >", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reg_type >=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThan(String value) {
            addCriterion("reg_type <", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThanOrEqualTo(String value) {
            addCriterion("reg_type <=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLike(String value) {
            addCriterion("reg_type like", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotLike(String value) {
            addCriterion("reg_type not like", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeIn(List<String> values) {
            addCriterion("reg_type in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotIn(List<String> values) {
            addCriterion("reg_type not in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeBetween(String value1, String value2) {
            addCriterion("reg_type between", value1, value2, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotBetween(String value1, String value2) {
            addCriterion("reg_type not between", value1, value2, "regType");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeIsNull() {
            addCriterion("token_exptime is null");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeIsNotNull() {
            addCriterion("token_exptime is not null");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeEqualTo(Integer value) {
            addCriterion("token_exptime =", value, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeNotEqualTo(Integer value) {
            addCriterion("token_exptime <>", value, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeGreaterThan(Integer value) {
            addCriterion("token_exptime >", value, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("token_exptime >=", value, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeLessThan(Integer value) {
            addCriterion("token_exptime <", value, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeLessThanOrEqualTo(Integer value) {
            addCriterion("token_exptime <=", value, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeIn(List<Integer> values) {
            addCriterion("token_exptime in", values, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeNotIn(List<Integer> values) {
            addCriterion("token_exptime not in", values, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeBetween(Integer value1, Integer value2) {
            addCriterion("token_exptime between", value1, value2, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andTokenExptimeNotBetween(Integer value1, Integer value2) {
            addCriterion("token_exptime not between", value1, value2, "tokenExptime");
            return (Criteria) this;
        }

        public Criteria andMessageEmailIsNull() {
            addCriterion("message_email is null");
            return (Criteria) this;
        }

        public Criteria andMessageEmailIsNotNull() {
            addCriterion("message_email is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEmailEqualTo(String value) {
            addCriterion("message_email =", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailNotEqualTo(String value) {
            addCriterion("message_email <>", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailGreaterThan(String value) {
            addCriterion("message_email >", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailGreaterThanOrEqualTo(String value) {
            addCriterion("message_email >=", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailLessThan(String value) {
            addCriterion("message_email <", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailLessThanOrEqualTo(String value) {
            addCriterion("message_email <=", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailLike(String value) {
            addCriterion("message_email like", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailNotLike(String value) {
            addCriterion("message_email not like", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailIn(List<String> values) {
            addCriterion("message_email in", values, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailNotIn(List<String> values) {
            addCriterion("message_email not in", values, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailBetween(String value1, String value2) {
            addCriterion("message_email between", value1, value2, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailNotBetween(String value1, String value2) {
            addCriterion("message_email not between", value1, value2, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("image_path is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("image_path is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("image_path =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("image_path <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("image_path >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("image_path >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("image_path <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("image_path <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("image_path like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("image_path not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("image_path in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("image_path not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("image_path between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("image_path not between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNull() {
            addCriterion("fans_count is null");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNotNull() {
            addCriterion("fans_count is not null");
            return (Criteria) this;
        }

        public Criteria andFansCountEqualTo(Integer value) {
            addCriterion("fans_count =", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotEqualTo(Integer value) {
            addCriterion("fans_count <>", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThan(Integer value) {
            addCriterion("fans_count >", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_count >=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThan(Integer value) {
            addCriterion("fans_count <", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThanOrEqualTo(Integer value) {
            addCriterion("fans_count <=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountIn(List<Integer> values) {
            addCriterion("fans_count in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotIn(List<Integer> values) {
            addCriterion("fans_count not in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountBetween(Integer value1, Integer value2) {
            addCriterion("fans_count between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_count not between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountIsNull() {
            addCriterion("real_fans_count is null");
            return (Criteria) this;
        }

        public Criteria andRealFansCountIsNotNull() {
            addCriterion("real_fans_count is not null");
            return (Criteria) this;
        }

        public Criteria andRealFansCountEqualTo(Integer value) {
            addCriterion("real_fans_count =", value, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountNotEqualTo(Integer value) {
            addCriterion("real_fans_count <>", value, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountGreaterThan(Integer value) {
            addCriterion("real_fans_count >", value, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_fans_count >=", value, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountLessThan(Integer value) {
            addCriterion("real_fans_count <", value, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountLessThanOrEqualTo(Integer value) {
            addCriterion("real_fans_count <=", value, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountIn(List<Integer> values) {
            addCriterion("real_fans_count in", values, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountNotIn(List<Integer> values) {
            addCriterion("real_fans_count not in", values, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountBetween(Integer value1, Integer value2) {
            addCriterion("real_fans_count between", value1, value2, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andRealFansCountNotBetween(Integer value1, Integer value2) {
            addCriterion("real_fans_count not between", value1, value2, "realFansCount");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNull() {
            addCriterion("app_type is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("app_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(Integer value) {
            addCriterion("app_type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(Integer value) {
            addCriterion("app_type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(Integer value) {
            addCriterion("app_type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(Integer value) {
            addCriterion("app_type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(Integer value) {
            addCriterion("app_type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<Integer> values) {
            addCriterion("app_type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<Integer> values) {
            addCriterion("app_type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(Integer value1, Integer value2) {
            addCriterion("app_type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("app_type not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andIsRobotIsNull() {
            addCriterion("is_robot is null");
            return (Criteria) this;
        }

        public Criteria andIsRobotIsNotNull() {
            addCriterion("is_robot is not null");
            return (Criteria) this;
        }

        public Criteria andIsRobotEqualTo(Integer value) {
            addCriterion("is_robot =", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotNotEqualTo(Integer value) {
            addCriterion("is_robot <>", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotGreaterThan(Integer value) {
            addCriterion("is_robot >", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_robot >=", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotLessThan(Integer value) {
            addCriterion("is_robot <", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotLessThanOrEqualTo(Integer value) {
            addCriterion("is_robot <=", value, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotIn(List<Integer> values) {
            addCriterion("is_robot in", values, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotNotIn(List<Integer> values) {
            addCriterion("is_robot not in", values, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotBetween(Integer value1, Integer value2) {
            addCriterion("is_robot between", value1, value2, "isRobot");
            return (Criteria) this;
        }

        public Criteria andIsRobotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_robot not between", value1, value2, "isRobot");
            return (Criteria) this;
        }

        public Criteria andCertificateLikeInsensitive(String value) {
            addCriterion("upper(certificate) like", value.toUpperCase(), "certificate");
            return (Criteria) this;
        }

        public Criteria andOpenidLikeInsensitive(String value) {
            addCriterion("upper(openid) like", value.toUpperCase(), "openid");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andRealnameLikeInsensitive(String value) {
            addCriterion("upper(realname) like", value.toUpperCase(), "realname");
            return (Criteria) this;
        }

        public Criteria andQqLikeInsensitive(String value) {
            addCriterion("upper(qq) like", value.toUpperCase(), "qq");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andSignatureLikeInsensitive(String value) {
            addCriterion("upper(signature) like", value.toUpperCase(), "signature");
            return (Criteria) this;
        }

        public Criteria andPlatformLikeInsensitive(String value) {
            addCriterion("upper(platform) like", value.toUpperCase(), "platform");
            return (Criteria) this;
        }

        public Criteria andVersionLikeInsensitive(String value) {
            addCriterion("upper(version) like", value.toUpperCase(), "version");
            return (Criteria) this;
        }

        public Criteria andRegistIpLikeInsensitive(String value) {
            addCriterion("upper(regist_ip) like", value.toUpperCase(), "registIp");
            return (Criteria) this;
        }

        public Criteria andUserKeyLikeInsensitive(String value) {
            addCriterion("upper(user_key) like", value.toUpperCase(), "userKey");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andTagsLikeInsensitive(String value) {
            addCriterion("upper(tags) like", value.toUpperCase(), "tags");
            return (Criteria) this;
        }

        public Criteria andUserTokenLikeInsensitive(String value) {
            addCriterion("upper(user_token) like", value.toUpperCase(), "userToken");
            return (Criteria) this;
        }

        public Criteria andRegTypeLikeInsensitive(String value) {
            addCriterion("upper(reg_type) like", value.toUpperCase(), "regType");
            return (Criteria) this;
        }

        public Criteria andMessageEmailLikeInsensitive(String value) {
            addCriterion("upper(message_email) like", value.toUpperCase(), "messageEmail");
            return (Criteria) this;
        }

        public Criteria andImagePathLikeInsensitive(String value) {
            addCriterion("upper(image_path) like", value.toUpperCase(), "imagePath");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria addByMap(Map<String, Object> map) {
             for (Map.Entry<String, Object> entry : map.entrySet()) {
                if(entry.getValue().toString().startsWith("%")){
                    addCriterion(entry.getKey()+" like",entry.getValue(),null);
                }else{
                    addCriterion(entry.getKey()+" =",entry.getValue(),null);
                }
            }
            return this;
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