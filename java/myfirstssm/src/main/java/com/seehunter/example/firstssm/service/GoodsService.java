package com.seehunter.example.firstssm.service;

import com.seehunter.example.firstssm.bean.GoodsExtends;
import com.seehunter.example.firstssm.bean.GoodsQueryVo;

import java.util.List;

/**
 * Created by Brian on 2016/3/3.
 */
//@Service
public interface GoodsService {
    //商品查询列表
    List<GoodsExtends> findGoodsList(GoodsQueryVo goodsQueryVo) throws Exception;

    //根据id查询商品信息

    /**
     * <p>Title: findGoodsById</p>
     * <p>Description: </p>
     *
     * @param id 查询商品的id
     * @return
     * @throws Exception
     */
    GoodsExtends findGoodsById(Integer id) throws Exception;

    //修改商品信息

    /**
     * <p>Title: updateGoods</p>
     * <p>Description: </p>
     *
     * @param id 修改商品的id
     * @param GoodsExtends 修改的商品信息
     * @throws Exception
     */
    void updateGoods(Integer id, GoodsExtends GoodsExtends) throws Exception;

}
