package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Journeyrate;
import com.company.springboot.train.dao.JourneyrateMapper;
import com.company.springboot.train.service.IJourneyrateService;
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
@Service("journeyrateService")
public class JourneyrateServiceImpl extends ServiceImpl<JourneyrateMapper, Journeyrate> implements IJourneyrateService {

}
