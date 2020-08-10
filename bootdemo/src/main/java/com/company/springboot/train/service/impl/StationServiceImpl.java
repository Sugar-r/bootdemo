package com.company.springboot.train.service.impl;

import com.company.springboot.train.dao.entity.Station;
import com.company.springboot.train.dao.StationMapper;
import com.company.springboot.train.service.IStationService;
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
@Service("stationService")
public class StationServiceImpl extends ServiceImpl<StationMapper, Station> implements IStationService {

}
