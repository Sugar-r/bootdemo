package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Route;
import com.company.springboot.train.dao.RouteMapper;
import com.company.springboot.train.service.IRouteService;
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
@Service("routeService")
public class RouteServiceImpl extends ServiceImpl<RouteMapper, Route> implements IRouteService {

}
