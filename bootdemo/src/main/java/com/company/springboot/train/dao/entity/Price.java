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
public class Price extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 票价率编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 车厢类型
     */
    private Integer traintype;

    /**
     * 车厢车体类型
     */
    private Integer trainbodytype;

    /**
     * 席位类型
     */
    private Integer seattype;

    /**
     * 票价率
     */
    private Double rate;

    /**
     * 比例
     */
    private Integer scale;


}
