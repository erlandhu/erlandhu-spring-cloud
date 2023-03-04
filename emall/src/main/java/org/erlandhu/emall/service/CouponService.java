package org.erlandhu.emall.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huaolan created on 2023/03/04
 */


@FeignClient(value = "coupon-service", path = "/coupon-server")
public interface CouponService {

    @GetMapping("discovery/get")
    String get();
}
