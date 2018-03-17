package com.lixu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.lixu.bean.User;

@Mapper
public interface UserDao {
    int insert(@Param("pojo") User pojo);

    int insertSelective(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List<User> pojo);

    int update(@Param("pojo") User pojo);

     List<String> findAddress();

     List<User> findByUsernameAndPassword(@Param("username")String username,@Param("password")String password);




}
