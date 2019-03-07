package com.seehunter.example.firstssm.mybatis.mapper;

import com.seehunter.example.firstssm.bean.OrderDetails;
import com.seehunter.example.firstssm.bean.OrderDetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailsMapper {
    int countByExample(OrderDetailsExample example);

    int deleteByExample(OrderDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetails record);

    int insertSelective(OrderDetails record);

    List<OrderDetails> selectByExample(OrderDetailsExample example);

    OrderDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);

    int updateByExample(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);
}