package org.erlandhu.coupon.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huaolan created on 2023/03/04
 */

@RestController
@RequestMapping("sentinel")
public class SentinelController {

    @SentinelResource(value = "sentinel_get", blockHandler = "blockHandler")
    @GetMapping("get")
    public String t() {
        int i = 1 / 0;
        return "sentinel";
    }


    public String blockHandler(BlockException exception) {
        return "降级了";
    }
}
