package com.lixu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.lixu.bean.Goods;

@Mapper
public interface GoodsDao {
    int insert(@Param("pojo") Goods pojo);

    int insertSelective(@Param("pojo") Goods pojo);

    int insertList(@Param("pojos") List<Goods> pojo);

    int update(@Param("pojo") Goods pojo);

    List<String> findName();


}
