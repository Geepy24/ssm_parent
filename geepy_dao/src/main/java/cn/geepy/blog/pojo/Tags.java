package cn.geepy.blog.pojo;

public class Tags {
    private Integer tid;

    private String tagname;

    private Integer tUId;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    public Integer gettUId() {
        return tUId;
    }

    public void settUId(Integer tUId) {
        this.tUId = tUId;
    }
}