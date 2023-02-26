package org.erlandhu.coupon.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huaolan created on 2023/02/26
 */


@RefreshScope
@RestController
@RequestMapping("nacosConfig")
public class NacosConfigController {


    @Value("${genwoshuo}")
    private String config;

    @GetMapping("test")
    public String test() {
        return config;
    }


}
