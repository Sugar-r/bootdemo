package com.company.springboot.train.controller;


import com.company.springboot.train.dao.entity.Carriage;
import com.company.springboot.train.service.ICarriageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mona
 * @since 2020-08-10
 */
@RestController
@RequestMapping("/carriage")
@Api(value = "列车编组模块")
public class CarriageController {
    @Autowired
    ICarriageService carriageService;
    @ApiOperation(value = "查询所有",notes = "查询之后，返回信息列表")
    @GetMapping ("list.do")
    public List<Carriage> findAll(){
        return carriageService.list();
    }
}
