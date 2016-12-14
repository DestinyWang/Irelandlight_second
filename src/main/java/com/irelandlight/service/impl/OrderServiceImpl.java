package com.irelandlight.service.impl;

import com.irelandlight.dao.OrderMapper;
import com.irelandlight.model.Order;
import com.irelandlight.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by as on 2016/12/9.
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderMapper orderMapper;

    //
    public List<Order> findOrderListByConsumerId(@Param("consumerId") Long consumerId) throws Exception {
        return orderMapper.findOrderListByConsumerId(consumerId);
    }
}