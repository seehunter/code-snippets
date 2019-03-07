package com.seehunter.example.firstssm.service.impl;

import com.seehunter.example.firstssm.exception.CustomException;
import com.seehunter.example.firstssm.mybatis.mapper.GoodsMapper;
import com.seehunter.example.firstssm.mybatis.mapper.GoodsMapperCustom;
import com.seehunter.example.firstssm.bean.Goods;
import com.seehunter.example.firstssm.bean.GoodsExtends;
import com.seehunter.example.firstssm.bean.GoodsQueryVo;
import com.seehunter.example.firstssm.service.GoodsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Brian on 2016/3/3.
 */
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapperCustom GoodsMapperCustom;

    @Autowired
    private GoodsMapper GoodsMapper;

    public List<GoodsExtends> findGoodsList(GoodsQueryVo goodsQueryVo) throws Exception {
        return GoodsMapperCustom.findGoodsList(goodsQueryVo);
    }

    public GoodsExtends findGoodsById(Integer id) throws Exception {
        Goods Goods = GoodsMapper.selectByPrimaryKey(id);
        if (Goods == null) {
            throw new CustomException("修改的商品信息不存在!");
        }
        //中间对商品信息进行业务处理
        //....
        //返回GoodsExtends
        GoodsExtends GoodsExtends = null;
        //将Goods的属性值拷贝到GoodsExtends
        if (Goods != null) {
            GoodsExtends = new GoodsExtends();
            BeanUtils.copyProperties(Goods, GoodsExtends);
        }

        return GoodsExtends;
    }

    public void updateGoods(Integer id, GoodsExtends GoodsExtends) throws Exception {
        //添加业务校验，通常在service接口对关键参数进行校验
        //校验 id是否为空，如果为空抛出异常

        //更新商品信息使用updateByPrimaryKeyWithBLOBs根据id更新Goods表中所有字段，包括 大文本类型字段
        //updateByPrimaryKeyWithBLOBs要求必须转入id
        GoodsExtends.setId(id);
        GoodsMapper.updateByPrimaryKeyWithBLOBs(GoodsExtends);
    }
}