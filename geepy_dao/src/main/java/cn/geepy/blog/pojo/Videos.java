package cn.geepy.blog.pojo;

public class Videos {
    private Integer vid;

    private String name;

    private Integer vCId;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getvCId() {
        return vCId;
    }

    public void setvCId(Integer vCId) {
        this.vCId = vCId;
    }
}