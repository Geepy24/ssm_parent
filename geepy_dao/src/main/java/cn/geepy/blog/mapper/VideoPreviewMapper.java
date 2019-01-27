package cn.geepy.blog.mapper;

import cn.geepy.blog.pojo.VideoPreview;
import cn.geepy.blog.pojo.VideoPreviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoPreviewMapper {
    int countByExample(VideoPreviewExample example);

    int deleteByExample(VideoPreviewExample example);

    int deleteByPrimaryKey(Integer vpId);

    int insert(VideoPreview record);

    int insertSelective(VideoPreview record);

    List<VideoPreview> selectByExample(VideoPreviewExample example);

    VideoPreview selectByPrimaryKey(Integer vpId);

    int updateByExampleSelective(@Param("record") VideoPreview record, @Param("example") VideoPreviewExample example);

    int updateByExample(@Param("record") VideoPreview record, @Param("example") VideoPreviewExample example);

    int updateByPrimaryKeySelective(VideoPreview record);

    int updateByPrimaryKey(VideoPreview record);
}