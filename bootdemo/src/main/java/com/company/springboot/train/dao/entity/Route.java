package com.company.springboot.train.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Route extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 线路编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 车次代码
     */
    private String tid;

    /**
     * 站序
     */
    private Integer siteorder;

    /**
     * 车站名
     */
    private String site;

    /**
     * 里程
     */
    private Double mile;

    /**
     * 发车时间
     */
    private LocalTime starttime;

    /**
     * 到站时间
     */
    private LocalTime endtime;

    /**
     * 停留时间
     */
    private Double staytime;

    /**
     * 运行时间
     */
    private String runtime;


}
