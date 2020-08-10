package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Seat;
import com.company.springboot.train.dao.SeatMapper;
import com.company.springboot.train.service.ISeatService;
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
@Service("seatService")
public class SeatServiceImpl extends ServiceImpl<SeatMapper, Seat> implements ISeatService {

}
