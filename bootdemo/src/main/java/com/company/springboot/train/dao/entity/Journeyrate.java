package com.company.springboot.train.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Journeyrate extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 递远递减率编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 里程区段From
     */
    private Integer journeyfrom;

    /**
     * 里程区段To
     */
    private Integer journeyto;

    /**
     * 递减率
     */
    private Integer reducerate;

    /**
     * 票价率
     */
    private Double pricerate;

    /**
     * 各区段全程票价
     */
    private Double thisprice;

    /**
     * 区段累计票价
     */
    private Double sumprice;


}
