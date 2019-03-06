package com.seehunter.example.firstssm.bean;

import java.util.List;

public class GoodsQueryVo {
    //商品信息
    private Goods Goods;

    //为了系统 可扩展性，对原始生成的po进行扩展
    private GoodsExtends GoodsExtends;

    //批量商品信息
    private List<GoodsExtends> GoodsList;

    public Goods getGoods() {
        return Goods;
    }

    public void setGoods(Goods Goods) {
        this.Goods = Goods;
    }

    public GoodsExtends getGoodsExtends() {
        return GoodsExtends;
    }

    public void setGoodsExtends(GoodsExtends GoodsExtends) {
        this.GoodsExtends = GoodsExtends;
    }

    public List<GoodsExtends> getGoodsList() {
        return GoodsList;
    }

    public void setGoodsList(List<GoodsExtends> GoodsList) {
        this.GoodsList = GoodsList;
    }
}
