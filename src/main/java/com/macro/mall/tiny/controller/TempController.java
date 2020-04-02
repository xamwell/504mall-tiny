package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.dto.UmsAdminLoginParam;
import com.macro.mall.tiny.mbg.model.UmsAdmin;
import com.macro.mall.tiny.mbg.model.UmsPermission;
import com.macro.mall.tiny.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller //视图用
@ResetController //将返回的对象数据直接以 JSON 或 XML 形式写入 HTTP 响应(Response)中

@Api(tags = "UmsAdminController", description = "后台用户管理")
@ApiOperation(value = a)//value = “接口说明”, httpMethod = “接口请求方式”, response = “接口返回参数类型”, notes = “接口发布说明”；
@RequestMapping("/admin")//上面的示例中没有指定 GET 与 PUT、POST 等，因为**@RequestMapping默认映射所有HTTP Action**，你可以使用@RequestMapping(method=ActionType)来缩小这个映射
@Service
@EnableAsync//异步任务

@EnableScheduling //定时任务


public class TempController {
//    @Override//是伪代码,表示重写
    @Autowired//自动
    @Async //异步任务
    @Scheduled(cron = "0 * * * * ?" ) //定时任务
    private UmsAdminService adminService;
    @Value("${jwt.tokenHeader}") //获取config文件
    private String tokenHeader;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @PostMapping("/register")//实际上就等价于 @RequestMapping(method = RequestMethod.POST)，同样的 @DeleteMapping ,@GetMapping也都一样，常用的 HTTP Action 都有一个这种形式的注解所对应
    @ResponseBody
    public CommonResult<UmsAdmin> register(@RequestBody UmsAdmin umsAdminParam, BindingResult result) {

    }

}
