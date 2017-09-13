package com.pea.it.provider.mapper;

import com.pea.it.provider.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
}