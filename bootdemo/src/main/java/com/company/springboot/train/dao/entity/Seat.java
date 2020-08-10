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
public class Seat extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 席位代码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 车次
     */
    private String tid;

    /**
     * 日期
     */
    private Date date;

    /**
     * 车厢
     */
    private Integer gnumber;

    /**
     * 座位号
     */
    private String seatnumber;

    /**
     * 乘车区间起始站
     */
    private String startstation;

    /**
     * 乘车区间终到站
     */
    private String endstation;

    /**
     * 车票状态
     */
    private Integer status;


}
