package org.erlandhu.coupon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huaolan created on 2023/03/04
 */

@RestController
@RequestMapping("discovery")
public class DiscoveryController {



    @GetMapping("get")
    public String t1() {
        return "get123123123";
    }
}
