package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Price;
import com.company.springboot.train.dao.PriceMapper;
import com.company.springboot.train.service.IPriceService;
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
@Service("priceService")
public class PriceServiceImpl extends ServiceImpl<PriceMapper, Price> implements IPriceService {

}
