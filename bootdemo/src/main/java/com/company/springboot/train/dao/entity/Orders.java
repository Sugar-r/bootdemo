package com.company.springboot.train.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mona
 * @since 2020-08-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Orders extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 订票代码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订票人代码
     */
    private Integer uid;

    /**
     * 车票编号
     */
    private Integer tkid;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 下单时间
     */
    private Date maketime;


}
