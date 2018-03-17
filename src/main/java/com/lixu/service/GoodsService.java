package com.lixu.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.lixu.bean.Goods;
import com.lixu.dao.GoodsDao;

@Service
public class GoodsService{

    @Resource
    private GoodsDao goodsDao;

    public int insert(Goods pojo){
        return goodsDao.insert(pojo);
    }

    public int insertSelective(Goods pojo){
        return goodsDao.insertSelective(pojo);
    }

    public int insertList(List<Goods> pojos){
        return goodsDao.insertList(pojos);
    }

    public int update(Goods pojo){
        return goodsDao.update(pojo);
    }
}
