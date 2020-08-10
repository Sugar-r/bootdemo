package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Train;
import com.company.springboot.train.dao.TrainMapper;
import com.company.springboot.train.service.ITrainService;
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
@Service("trainService")
public class TrainServiceImpl extends ServiceImpl<TrainMapper, Train> implements ITrainService {

}
