package cn.zuo.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author hui.zuo@transsnet.com
 * @date 2021/12/1
 * @description:
 */
@RestController
public class TestController {

    @GetMapping("/user/get")
    public String getUser(String param, HttpServletResponse response){
        System.out.println("次数"+111111);
        response.setStatus(HttpStatus.BAD_GATEWAY.value());
        response.setHeader("Retry-After","50");
        return "user->" + param;
    }

}
