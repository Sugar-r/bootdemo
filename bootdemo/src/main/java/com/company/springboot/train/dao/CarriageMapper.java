package com.company.springboot.train.dao;

import com.company.springboot.train.dao.entity.Carriage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mona
 * @since 2020-08-10
 */
@Mapper
public interface CarriageMapper extends BaseMapper<Carriage> {

}
