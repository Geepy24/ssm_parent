package cn.geepy.blog.mapper;

import cn.geepy.blog.pojo.Videos;
import cn.geepy.blog.pojo.VideosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideosMapper {
    int countByExample(VideosExample example);

    int deleteByExample(VideosExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Videos record);

    int insertSelective(Videos record);

    List<Videos> selectByExample(VideosExample example);

    Videos selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Videos record, @Param("example") VideosExample example);

    int updateByExample(@Param("record") Videos record, @Param("example") VideosExample example);

    int updateByPrimaryKeySelective(Videos record);

    int updateByPrimaryKey(Videos record);
}