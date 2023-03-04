package org.erlandhu.emall.controller;

import org.erlandhu.emall.service.CouponService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author huaolan created on 2023/03/04
 */


@RestController
@RequestMapping("discovery")
public class DiscoveryController {

    private final RestTemplate restTemplate;
    private final CouponService couponService;

    @GetMapping("t")
    public String t() {
//        return restTemplate.getForObject("http://coupon-service/coupon-server/discovery/get", String.class);
        return couponService.get();
    }




    public DiscoveryController(RestTemplate restTemplate, CouponService couponService) {
        this.restTemplate = restTemplate;
        this.couponService = couponService;
    }
}
