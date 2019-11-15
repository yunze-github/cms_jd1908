package com.briup.apps.cms.web.controller;

import com.briup.apps.cms.bean.Category;
import com.briup.apps.cms.service.ICategoryService;
import com.briup.apps.cms.utils.Message;
import com.briup.apps.cms.utils.MessageUtil;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;

@RestController
@RequestMapping("category")
public class ICategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/findAll")
    @ApiOperation(value = "所有栏目",notes = "查找所有的栏目信息")
    public Message findAll() {
        return MessageUtil.success("查询成功!",categoryService.findAllCategorys());
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或更新栏目")
    public Message saveOrUpdate(Category category){
        categoryService.saveOrUpdate(category);
        if (category.getId()!=null) {
            return MessageUtil.success("更新成功!");
        }else {
            return MessageUtil.success("保存成功!");
        }
    }

    @GetMapping("/dropOne")
    @ApiOperation(value = "删除一个栏目")
    @ApiImplicitParams(
            @ApiImplicitParam(paramType = "query",dataType = "long",required = true,name = "categoryId",value = "栏目ID")
    )
    public Message dropOne(Long id) {
        categoryService.dropCategory(id);
        return MessageUtil.success("删除成功!");
    }

    @PostMapping("/dropSome")
    @ApiOperation("删除多个栏目信息")
    @ApiImplicitParams(
            @ApiImplicitParam(paramType = "body",dataType = "long",required = true,name = "categoryIds",value = "栏目组IDS")
    )
    public Message dropSome(@RequestBody Long[] ids) {
        categoryService.dropCategorys(ids);
        return MessageUtil.success("删除成功!");
    }
}
