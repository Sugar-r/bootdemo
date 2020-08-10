package com.company.springboot.train.dao.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalTime;
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
public class Train extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 车次代码
     */
    private String id;

    /**
     * 起始站
     */
    private String startstation;

    /**
     * 终到站
     */
    private String endstation;

    /**
     * 始发时间
     */
    private LocalTime starttime;

    /**
     * 终到时间
     */
    private LocalTime endtime;

    /**
     * 里程
     */
    private Double mile;

    /**
     * 无座票数量
     */
    private Integer noseatnumber;

    /**
     * 车辆车体分类
     */
    private Integer bodytype;

    /**
     * 列车类型
     */
    private Integer type;


}
