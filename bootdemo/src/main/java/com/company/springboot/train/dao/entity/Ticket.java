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
public class Ticket extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 车票代码
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
    private Integer seatnumber;

    /**
     * 乘车区间起始站
     */
    private String startstation;

    /**
     * 乘车区间终到站
     */
    private String endstation;

    /**
     * 价格
     */
    private Double price;

    /**
     * 乘客姓名
     */
    private String uname;

    /**
     * 乘客类型
     */
    private Integer utype;

    /**
     * 身份证号
     */
    private String uidnumber;

    /**
     * 销售方式
     */
    private Integer saletype;

    /**
     * 销售时间
     */
    private Date saletime;

    /**
     * 车票状态
     */
    private Integer status;

    /**
     * 状态次数
     */
    private Integer revisetime;


}
