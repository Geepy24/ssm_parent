package cn.geepy.blog.pojo;

import java.util.Date;

public class Comments {
    private Integer comId;

    private Date created;

    private Date modified;

    private Integer comUId;

    private Integer comAId;

    private Integer comCUd;

    private String text;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
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

    public Integer getComUId() {
        return comUId;
    }

    public void setComUId(Integer comUId) {
        this.comUId = comUId;
    }

    public Integer getComAId() {
        return comAId;
    }

    public void setComAId(Integer comAId) {
        this.comAId = comAId;
    }

    public Integer getComCUd() {
        return comCUd;
    }

    public void setComCUd(Integer comCUd) {
        this.comCUd = comCUd;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}