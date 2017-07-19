package com.zhz.domain;


import java.io.Serializable;
import java.util.Date;

public class Content  implements Serializable {
    private Integer id;

    private String title;

    private Integer albumId;

    private Integer userId;

    private String filename;

    private String filename64;

    private Integer fileSize;

    private Integer fileSize64;

    private String fileExt;

    private String duration;

    private Integer status;

    private Boolean isDel;

    private Integer displayOrder;

    private Integer adminId;

    private Date createdAt;

    private Date updatedAt;

    private Integer playCount;

    private Integer likeCount;

    private Integer commentCount;

    private Date onlineTime;

    private Integer shareCount;

    private Integer source;

    private Integer poolId;

    private Integer realLikeCount;

    private Integer realPlayCount;

    private Integer downloadCount;

    private Integer realDownloadCount;

    private Integer isDown;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename64() {
        return filename64;
    }

    public void setFilename64(String filename64) {
        this.filename64 = filename64;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getFileSize64() {
        return fileSize64;
    }

    public void setFileSize64(Integer fileSize64) {
        this.fileSize64 = fileSize64;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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

    public Integer getPlayCount() {
        return playCount;
    }

    public void setPlayCount(Integer playCount) {
        this.playCount = playCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Integer getRealLikeCount() {
        return realLikeCount;
    }

    public void setRealLikeCount(Integer realLikeCount) {
        this.realLikeCount = realLikeCount;
    }

    public Integer getRealPlayCount() {
        return realPlayCount;
    }

    public void setRealPlayCount(Integer realPlayCount) {
        this.realPlayCount = realPlayCount;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public Integer getRealDownloadCount() {
        return realDownloadCount;
    }

    public void setRealDownloadCount(Integer realDownloadCount) {
        this.realDownloadCount = realDownloadCount;
    }

    public Integer getIsDown() {
        return isDown;
    }

    public void setIsDown(Integer isDown) {
        this.isDown = isDown;
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
        Content other = (Content) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAlbumId() == null ? other.getAlbumId() == null : this.getAlbumId().equals(other.getAlbumId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
            && (this.getFilename64() == null ? other.getFilename64() == null : this.getFilename64().equals(other.getFilename64()))
            && (this.getFileSize() == null ? other.getFileSize() == null : this.getFileSize().equals(other.getFileSize()))
            && (this.getFileSize64() == null ? other.getFileSize64() == null : this.getFileSize64().equals(other.getFileSize64()))
            && (this.getFileExt() == null ? other.getFileExt() == null : this.getFileExt().equals(other.getFileExt()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getDisplayOrder() == null ? other.getDisplayOrder() == null : this.getDisplayOrder().equals(other.getDisplayOrder()))
            && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
            && (this.getPlayCount() == null ? other.getPlayCount() == null : this.getPlayCount().equals(other.getPlayCount()))
            && (this.getLikeCount() == null ? other.getLikeCount() == null : this.getLikeCount().equals(other.getLikeCount()))
            && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()))
            && (this.getOnlineTime() == null ? other.getOnlineTime() == null : this.getOnlineTime().equals(other.getOnlineTime()))
            && (this.getShareCount() == null ? other.getShareCount() == null : this.getShareCount().equals(other.getShareCount()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getPoolId() == null ? other.getPoolId() == null : this.getPoolId().equals(other.getPoolId()))
            && (this.getRealLikeCount() == null ? other.getRealLikeCount() == null : this.getRealLikeCount().equals(other.getRealLikeCount()))
            && (this.getRealPlayCount() == null ? other.getRealPlayCount() == null : this.getRealPlayCount().equals(other.getRealPlayCount()))
            && (this.getDownloadCount() == null ? other.getDownloadCount() == null : this.getDownloadCount().equals(other.getDownloadCount()))
            && (this.getRealDownloadCount() == null ? other.getRealDownloadCount() == null : this.getRealDownloadCount().equals(other.getRealDownloadCount()))
            && (this.getIsDown() == null ? other.getIsDown() == null : this.getIsDown().equals(other.getIsDown()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAlbumId() == null) ? 0 : getAlbumId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        result = prime * result + ((getFilename64() == null) ? 0 : getFilename64().hashCode());
        result = prime * result + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        result = prime * result + ((getFileSize64() == null) ? 0 : getFileSize64().hashCode());
        result = prime * result + ((getFileExt() == null) ? 0 : getFileExt().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getDisplayOrder() == null) ? 0 : getDisplayOrder().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        result = prime * result + ((getPlayCount() == null) ? 0 : getPlayCount().hashCode());
        result = prime * result + ((getLikeCount() == null) ? 0 : getLikeCount().hashCode());
        result = prime * result + ((getCommentCount() == null) ? 0 : getCommentCount().hashCode());
        result = prime * result + ((getOnlineTime() == null) ? 0 : getOnlineTime().hashCode());
        result = prime * result + ((getShareCount() == null) ? 0 : getShareCount().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        result = prime * result + ((getRealLikeCount() == null) ? 0 : getRealLikeCount().hashCode());
        result = prime * result + ((getRealPlayCount() == null) ? 0 : getRealPlayCount().hashCode());
        result = prime * result + ((getDownloadCount() == null) ? 0 : getDownloadCount().hashCode());
        result = prime * result + ((getRealDownloadCount() == null) ? 0 : getRealDownloadCount().hashCode());
        result = prime * result + ((getIsDown() == null) ? 0 : getIsDown().hashCode());
        return result;
    }

    public Content id(Integer value) {
        this.id = value;
        return this;
    }

    public Content title(String value) {
        this.title = value;
        return this;
    }

    public Content albumId(Integer value) {
        this.albumId = value;
        return this;
    }

    public Content userId(Integer value) {
        this.userId = value;
        return this;
    }

    public Content filename(String value) {
        this.filename = value;
        return this;
    }

    public Content filename64(String value) {
        this.filename64 = value;
        return this;
    }

    public Content fileSize(Integer value) {
        this.fileSize = value;
        return this;
    }

    public Content fileSize64(Integer value) {
        this.fileSize64 = value;
        return this;
    }

    public Content fileExt(String value) {
        this.fileExt = value;
        return this;
    }

    public Content duration(String value) {
        this.duration = value;
        return this;
    }

    public Content status(Integer value) {
        this.status = value;
        return this;
    }

    public Content isDel(Boolean value) {
        this.isDel = value;
        return this;
    }

    public Content displayOrder(Integer value) {
        this.displayOrder = value;
        return this;
    }

    public Content adminId(Integer value) {
        this.adminId = value;
        return this;
    }

    public Content createdAt(Date value) {
        this.createdAt = value;
        return this;
    }

    public Content updatedAt(Date value) {
        this.updatedAt = value;
        return this;
    }

    public Content playCount(Integer value) {
        this.playCount = value;
        return this;
    }

    public Content likeCount(Integer value) {
        this.likeCount = value;
        return this;
    }

    public Content commentCount(Integer value) {
        this.commentCount = value;
        return this;
    }

    public Content onlineTime(Date value) {
        this.onlineTime = value;
        return this;
    }

    public Content shareCount(Integer value) {
        this.shareCount = value;
        return this;
    }

    public Content source(Integer value) {
        this.source = value;
        return this;
    }

    public Content poolId(Integer value) {
        this.poolId = value;
        return this;
    }

    public Content realLikeCount(Integer value) {
        this.realLikeCount = value;
        return this;
    }

    public Content realPlayCount(Integer value) {
        this.realPlayCount = value;
        return this;
    }

    public Content downloadCount(Integer value) {
        this.downloadCount = value;
        return this;
    }

    public Content realDownloadCount(Integer value) {
        this.realDownloadCount = value;
        return this;
    }

}