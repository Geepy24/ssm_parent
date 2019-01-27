package cn.geepy.blog.mapper;

import cn.geepy.blog.pojo.Articles;
import cn.geepy.blog.pojo.ArticlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticlesMapper {
    int countByExample(ArticlesExample example);

    int deleteByExample(ArticlesExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Articles record);

    int insertSelective(Articles record);

    List<Articles> selectByExampleWithBLOBs(ArticlesExample example);

    List<Articles> selectByExample(ArticlesExample example);

    Articles selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByExampleWithBLOBs(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByExample(@Param("record") Articles record, @Param("example") ArticlesExample example);

    int updateByPrimaryKeySelective(Articles record);

    int updateByPrimaryKeyWithBLOBs(Articles record);

    int updateByPrimaryKey(Articles record);
}