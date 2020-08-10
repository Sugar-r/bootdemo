package com.company.springboot.train.dao.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Station extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 车站代码
     */
    private String id;

    /**
     * 车站名
     */
    private String name;

    /**
     * 拼音码
     */
    private String pinyin;

    /**
     * 所属行政区域
     */
    private String region;


}
