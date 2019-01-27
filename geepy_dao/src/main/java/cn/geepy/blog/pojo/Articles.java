package cn.geepy.blog.pojo;

public class Articles {
    private Integer aid;

    private String title;

    private String status;

    private Integer aCId;

    private String text;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getaCId() {
        return aCId;
    }

    public void setaCId(Integer aCId) {
        this.aCId = aCId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}