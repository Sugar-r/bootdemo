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
public class Journey extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 旅程区编号
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
     * 区段数
     */
    private Integer number;

    /**
     * 每区段里程
     */
    private Integer permile;


}
