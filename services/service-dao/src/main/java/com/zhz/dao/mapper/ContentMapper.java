package com.zhz.dao.mapper;


import com.zhz.datasource.TableSharding;
import com.zhz.domain.Content;
import com.zhz.domain.ContentConditions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@DataSource("default")
@TableSharding(table = "duotin_content",shardBy = "id",shardType = "shard_mod",tableNum = 2)
public interface ContentMapper {
    int countByExample(ContentConditions example);

    int deleteByExample(ContentConditions example);

    int deleteByPrimaryKey(Integer id);

    int insert(Content record);

    int insertSelective(Content record);

    List<Content> selectByExample(ContentConditions example);

    Content selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Content record, @Param("example") ContentConditions example);

    int updateByExample(@Param("record") Content record, @Param("example") ContentConditions example);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);

    int selectMaxDisplayOrder();

    List<Integer> selectDisplayOrder(ContentConditions example);

    List<Integer> selectIdsByExample(ContentConditions example);
}