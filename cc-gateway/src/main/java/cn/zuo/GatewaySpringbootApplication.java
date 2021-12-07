package cn.zuo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zuohui
 * @date 2020/12/6 - 21:51
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GatewaySpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewaySpringbootApplication.class,args);
    }

}
