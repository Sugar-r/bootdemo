package com.company.springboot.train.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
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
@Api(value = "列车编组")
public class Carriage extends Model {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "id",required = true,notes = "列车编组编号")
    /**
     * 列车编组编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "id",required = true,notes = "车次代码")
    /**
     * 车次代码
     */
    private String tid;

    @ApiModelProperty(value = "id",required = true,notes = "列车编组编号")
    /**
     * 车厢号
     */
    private Integer number;

    @ApiModelProperty(value = "id",required = true,notes = "车厢号")
    /**
     * 车厢坐席类型
     */
    private Integer seattype;

    @ApiModelProperty(value = "id",required = true,notes = "车厢座席数量")
    /**
     * 车厢座席数量
     */
    private Integer seatnumber;

    @ApiModelProperty(value = "id",required = true,notes = "车厢类型")
    /**
     * 车厢类型
     */
    private Integer type;


}
