package com.zhz.dao.mapper;

import com.zhz.datasource.DataSource;
import com.zhz.domain.User;
import com.zhz.domain.UserConditions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@DataSource("www")
public interface UserMapper {
    int countByExample(UserConditions example);

    int deleteByExample(UserConditions example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserConditions example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserConditions example);

    int updateByExample(@Param("record") User record, @Param("example") UserConditions example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}