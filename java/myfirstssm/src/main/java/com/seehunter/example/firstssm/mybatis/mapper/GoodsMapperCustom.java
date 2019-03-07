package com.seehunter.example.firstssm.mybatis.mapper;

import com.seehunter.example.firstssm.bean.GoodsExtends;
import com.seehunter.example.firstssm.bean.GoodsQueryVo;

import java.util.List;

public interface GoodsMapperCustom {
    //商品查询列表
    List<GoodsExtends> findItemsList(GoodsQueryVo goodsQueryVo) throws Exception;

    List<GoodsExtends> findGoodsList(GoodsQueryVo goodsQueryVo);
}