package org.erlandhu.emall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huaolan created on 2023/03/04
 */

@EnableFeignClients
@SpringBootApplication
public class EmallApplication {


    public static void main(String[] args) {
        SpringApplication.run(EmallApplication.class, args);
    }
}
