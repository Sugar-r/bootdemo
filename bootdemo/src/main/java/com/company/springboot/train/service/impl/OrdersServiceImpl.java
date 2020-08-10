package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Orders;
import com.company.springboot.train.dao.OrdersMapper;
import com.company.springboot.train.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mona
 * @since 2020-08-10
 */
@Service("ordersService")
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
