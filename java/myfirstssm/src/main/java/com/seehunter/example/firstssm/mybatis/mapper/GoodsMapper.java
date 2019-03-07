package com.seehunter.example.firstssm.mybatis.mapper;

import com.seehunter.example.firstssm.bean.Goods;
import com.seehunter.example.firstssm.bean.GoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);
    

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExampleWithBLOBs(GoodsExample example);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKeyWithBLOBs(Goods record);

    int updateByPrimaryKey(Goods record);
}