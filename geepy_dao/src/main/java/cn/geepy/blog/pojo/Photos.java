package cn.geepy.blog.pojo;

public class Photos {
    private Integer pid;

    private String name;

    private Integer pCId;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getpCId() {
        return pCId;
    }

    public void setpCId(Integer pCId) {
        this.pCId = pCId;
    }
}