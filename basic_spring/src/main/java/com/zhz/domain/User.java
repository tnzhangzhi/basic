package com.zhz.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;

    private String certificate;

    private String openid;

    private Integer deviceId;

    private String username;

    private String password;

    private String realname;

    private Integer sex;

    private String qq;

    private String mobile;

    private Integer imageId;

    private String email;

    private String signature;

    private String platform;

    private String version;

    private Boolean userType;

    private Long listenTime;

    private Boolean status;

    private Date lastlogin;

    private Integer logintimes;

    private Date createdAt;

    private Date updatedAt;

    private String registIp;

    private String userKey;

    private Date refreshFeedsAt;

    private Long refreshFeedsAtId;

    private Integer isSubscribeCategory;

    private Integer isPodcaster;

    private Integer isV;

    private String description;

    private String tags;

    private String userToken;

    private Integer userState;

    private String regType;

    private Integer tokenExptime;

    private String messageEmail;

    private String imagePath;

    private Integer fansCount;

    private Integer realFansCount;

    private Integer appType;

    private Integer isRobot;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getUserType() {
        return userType;
    }

    public void setUserType(Boolean userType) {
        this.userType = userType;
    }

    public Long getListenTime() {
        return listenTime;
    }

    public void setListenTime(Long listenTime) {
        this.listenTime = listenTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getRegistIp() {
        return registIp;
    }

    public void setRegistIp(String registIp) {
        this.registIp = registIp;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public Date getRefreshFeedsAt() {
        return refreshFeedsAt;
    }

    public void setRefreshFeedsAt(Date refreshFeedsAt) {
        this.refreshFeedsAt = refreshFeedsAt;
    }

    public Long getRefreshFeedsAtId() {
        return refreshFeedsAtId;
    }

    public void setRefreshFeedsAtId(Long refreshFeedsAtId) {
        this.refreshFeedsAtId = refreshFeedsAtId;
    }

    public Integer getIsSubscribeCategory() {
        return isSubscribeCategory;
    }

    public void setIsSubscribeCategory(Integer isSubscribeCategory) {
        this.isSubscribeCategory = isSubscribeCategory;
    }

    public Integer getIsPodcaster() {
        return isPodcaster;
    }

    public void setIsPodcaster(Integer isPodcaster) {
        this.isPodcaster = isPodcaster;
    }

    public Integer getIsV() {
        return isV;
    }

    public void setIsV(Integer isV) {
        this.isV = isV;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public Integer getTokenExptime() {
        return tokenExptime;
    }

    public void setTokenExptime(Integer tokenExptime) {
        this.tokenExptime = tokenExptime;
    }

    public String getMessageEmail() {
        return messageEmail;
    }

    public void setMessageEmail(String messageEmail) {
        this.messageEmail = messageEmail;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    public Integer getRealFansCount() {
        return realFansCount;
    }

    public void setRealFansCount(Integer realFansCount) {
        this.realFansCount = realFansCount;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public Integer getIsRobot() {
        return isRobot;
    }

    public void setIsRobot(Integer isRobot) {
        this.isRobot = isRobot;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCertificate() == null ? other.getCertificate() == null : this.getCertificate().equals(other.getCertificate()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getImageId() == null ? other.getImageId() == null : this.getImageId().equals(other.getImageId()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getListenTime() == null ? other.getListenTime() == null : this.getListenTime().equals(other.getListenTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLastlogin() == null ? other.getLastlogin() == null : this.getLastlogin().equals(other.getLastlogin()))
            && (this.getLogintimes() == null ? other.getLogintimes() == null : this.getLogintimes().equals(other.getLogintimes()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
            && (this.getRegistIp() == null ? other.getRegistIp() == null : this.getRegistIp().equals(other.getRegistIp()))
            && (this.getUserKey() == null ? other.getUserKey() == null : this.getUserKey().equals(other.getUserKey()))
            && (this.getRefreshFeedsAt() == null ? other.getRefreshFeedsAt() == null : this.getRefreshFeedsAt().equals(other.getRefreshFeedsAt()))
            && (this.getRefreshFeedsAtId() == null ? other.getRefreshFeedsAtId() == null : this.getRefreshFeedsAtId().equals(other.getRefreshFeedsAtId()))
            && (this.getIsSubscribeCategory() == null ? other.getIsSubscribeCategory() == null : this.getIsSubscribeCategory().equals(other.getIsSubscribeCategory()))
            && (this.getIsPodcaster() == null ? other.getIsPodcaster() == null : this.getIsPodcaster().equals(other.getIsPodcaster()))
            && (this.getIsV() == null ? other.getIsV() == null : this.getIsV().equals(other.getIsV()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getUserToken() == null ? other.getUserToken() == null : this.getUserToken().equals(other.getUserToken()))
            && (this.getUserState() == null ? other.getUserState() == null : this.getUserState().equals(other.getUserState()))
            && (this.getRegType() == null ? other.getRegType() == null : this.getRegType().equals(other.getRegType()))
            && (this.getTokenExptime() == null ? other.getTokenExptime() == null : this.getTokenExptime().equals(other.getTokenExptime()))
            && (this.getMessageEmail() == null ? other.getMessageEmail() == null : this.getMessageEmail().equals(other.getMessageEmail()))
            && (this.getImagePath() == null ? other.getImagePath() == null : this.getImagePath().equals(other.getImagePath()))
            && (this.getFansCount() == null ? other.getFansCount() == null : this.getFansCount().equals(other.getFansCount()))
            && (this.getRealFansCount() == null ? other.getRealFansCount() == null : this.getRealFansCount().equals(other.getRealFansCount()))
            && (this.getAppType() == null ? other.getAppType() == null : this.getAppType().equals(other.getAppType()))
            && (this.getIsRobot() == null ? other.getIsRobot() == null : this.getIsRobot().equals(other.getIsRobot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getImageId() == null) ? 0 : getImageId().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getListenTime() == null) ? 0 : getListenTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLastlogin() == null) ? 0 : getLastlogin().hashCode());
        result = prime * result + ((getLogintimes() == null) ? 0 : getLogintimes().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        result = prime * result + ((getRegistIp() == null) ? 0 : getRegistIp().hashCode());
        result = prime * result + ((getUserKey() == null) ? 0 : getUserKey().hashCode());
        result = prime * result + ((getRefreshFeedsAt() == null) ? 0 : getRefreshFeedsAt().hashCode());
        result = prime * result + ((getRefreshFeedsAtId() == null) ? 0 : getRefreshFeedsAtId().hashCode());
        result = prime * result + ((getIsSubscribeCategory() == null) ? 0 : getIsSubscribeCategory().hashCode());
        result = prime * result + ((getIsPodcaster() == null) ? 0 : getIsPodcaster().hashCode());
        result = prime * result + ((getIsV() == null) ? 0 : getIsV().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getUserToken() == null) ? 0 : getUserToken().hashCode());
        result = prime * result + ((getUserState() == null) ? 0 : getUserState().hashCode());
        result = prime * result + ((getRegType() == null) ? 0 : getRegType().hashCode());
        result = prime * result + ((getTokenExptime() == null) ? 0 : getTokenExptime().hashCode());
        result = prime * result + ((getMessageEmail() == null) ? 0 : getMessageEmail().hashCode());
        result = prime * result + ((getImagePath() == null) ? 0 : getImagePath().hashCode());
        result = prime * result + ((getFansCount() == null) ? 0 : getFansCount().hashCode());
        result = prime * result + ((getRealFansCount() == null) ? 0 : getRealFansCount().hashCode());
        result = prime * result + ((getAppType() == null) ? 0 : getAppType().hashCode());
        result = prime * result + ((getIsRobot() == null) ? 0 : getIsRobot().hashCode());
        return result;
    }

    public User id(Integer value) {
        this.id = value;
        return this;
    }

    public User certificate(String value) {
        this.certificate = value;
        return this;
    }

    public User openid(String value) {
        this.openid = value;
        return this;
    }

    public User deviceId(Integer value) {
        this.deviceId = value;
        return this;
    }

    public User username(String value) {
        this.username = value;
        return this;
    }

    public User password(String value) {
        this.password = value;
        return this;
    }

    public User realname(String value) {
        this.realname = value;
        return this;
    }

    public User sex(Integer value) {
        this.sex = value;
        return this;
    }

    public User qq(String value) {
        this.qq = value;
        return this;
    }

    public User mobile(String value) {
        this.mobile = value;
        return this;
    }

    public User imageId(Integer value) {
        this.imageId = value;
        return this;
    }

    public User email(String value) {
        this.email = value;
        return this;
    }

    public User signature(String value) {
        this.signature = value;
        return this;
    }

    public User platform(String value) {
        this.platform = value;
        return this;
    }

    public User version(String value) {
        this.version = value;
        return this;
    }

    public User userType(Boolean value) {
        this.userType = value;
        return this;
    }

    public User listenTime(Long value) {
        this.listenTime = value;
        return this;
    }

    public User status(Boolean value) {
        this.status = value;
        return this;
    }

    public User lastlogin(Date value) {
        this.lastlogin = value;
        return this;
    }

    public User logintimes(Integer value) {
        this.logintimes = value;
        return this;
    }

    public User createdAt(Date value) {
        this.createdAt = value;
        return this;
    }

    public User updatedAt(Date value) {
        this.updatedAt = value;
        return this;
    }

    public User registIp(String value) {
        this.registIp = value;
        return this;
    }

    public User userKey(String value) {
        this.userKey = value;
        return this;
    }

    public User refreshFeedsAt(Date value) {
        this.refreshFeedsAt = value;
        return this;
    }

    public User refreshFeedsAtId(Long value) {
        this.refreshFeedsAtId = value;
        return this;
    }

    public User isSubscribeCategory(Integer value) {
        this.isSubscribeCategory = value;
        return this;
    }

    public User isPodcaster(Integer value) {
        this.isPodcaster = value;
        return this;
    }

    public User isV(Integer value) {
        this.isV = value;
        return this;
    }

    public User description(String value) {
        this.description = value;
        return this;
    }

    public User tags(String value) {
        this.tags = value;
        return this;
    }

    public User userToken(String value) {
        this.userToken = value;
        return this;
    }

    public User userState(Integer value) {
        this.userState = value;
        return this;
    }

    public User regType(String value) {
        this.regType = value;
        return this;
    }

    public User tokenExptime(Integer value) {
        this.tokenExptime = value;
        return this;
    }

    public User messageEmail(String value) {
        this.messageEmail = value;
        return this;
    }

    public User imagePath(String value) {
        this.imagePath = value;
        return this;
    }

    public User fansCount(Integer value) {
        this.fansCount = value;
        return this;
    }

    public User realFansCount(Integer value) {
        this.realFansCount = value;
        return this;
    }

    public User appType(Integer value) {
        this.appType = value;
        return this;
    }

    public User isRobot(Integer value) {
        this.isRobot = value;
        return this;
    }
}