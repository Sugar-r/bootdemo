package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Journey;
import com.company.springboot.train.dao.JourneyMapper;
import com.company.springboot.train.service.IJourneyService;
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
@Service("journeyService")
public class JourneyServiceImpl extends ServiceImpl<JourneyMapper, Journey> implements IJourneyService {

}
