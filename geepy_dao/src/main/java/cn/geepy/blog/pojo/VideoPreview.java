package cn.geepy.blog.pojo;

public class VideoPreview {
    private Integer vpId;

    private String preName;

    private Integer vpVId;

    public Integer getVpId() {
        return vpId;
    }

    public void setVpId(Integer vpId) {
        this.vpId = vpId;
    }

    public String getPreName() {
        return preName;
    }

    public void setPreName(String preName) {
        this.preName = preName == null ? null : preName.trim();
    }

    public Integer getVpVId() {
        return vpVId;
    }

    public void setVpVId(Integer vpVId) {
        this.vpVId = vpVId;
    }
}