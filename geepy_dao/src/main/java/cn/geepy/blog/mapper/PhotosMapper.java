package cn.geepy.blog.mapper;

import cn.geepy.blog.pojo.Photos;
import cn.geepy.blog.pojo.PhotosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotosMapper {
    int countByExample(PhotosExample example);

    int deleteByExample(PhotosExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Photos record);

    int insertSelective(Photos record);

    List<Photos> selectByExample(PhotosExample example);

    Photos selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Photos record, @Param("example") PhotosExample example);

    int updateByExample(@Param("record") Photos record, @Param("example") PhotosExample example);

    int updateByPrimaryKeySelective(Photos record);

    int updateByPrimaryKey(Photos record);
}