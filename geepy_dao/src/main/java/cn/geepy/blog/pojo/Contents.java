package cn.geepy.blog.pojo;

import java.util.Date;

public class Contents {
    private Integer cid;

    private Date created;

    private Date modified;

    private String status;

    private String type;

    private String allowcomment;

    private Integer cUId;

    private Integer standup;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAllowcomment() {
        return allowcomment;
    }

    public void setAllowcomment(String allowcomment) {
        this.allowcomment = allowcomment == null ? null : allowcomment.trim();
    }

    public Integer getcUId() {
        return cUId;
    }

    public void setcUId(Integer cUId) {
        this.cUId = cUId;
    }

    public Integer getStandup() {
        return standup;
    }

    public void setStandup(Integer standup) {
        this.standup = standup;
    }
}