package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Carriage;
import com.company.springboot.train.dao.CarriageMapper;
import com.company.springboot.train.service.ICarriageService;
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
@Service("carriageService")
public class CarriageServiceImpl extends ServiceImpl<CarriageMapper, Carriage> implements ICarriageService {

}
