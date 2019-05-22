package com.rest.controller;

import com.quark.common.base.BaseController;
import com.quark.common.dto.QuarkResult;
import com.quark.common.entity.Label;
import com.rest.service.RestLabelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Author LHR
 * Create By 2017/8/27
 */
@Api(value = "标签接口",description = "获取标签")
@RestController
@RequestMapping("/rest/label")
public class RestLabelController extends BaseController{

    @Autowired
    private RestLabelService labelService;


    @ApiOperation("获取标签")
    @GetMapping
    public QuarkResult getAllLabel(){

        QuarkResult result = restProcessor(() -> {
            List<Label> labels = labelService.findAll();
            return QuarkResult.ok(labels);
        });

        return result;
    }



}
