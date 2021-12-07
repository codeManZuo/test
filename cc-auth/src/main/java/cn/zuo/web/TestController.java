package cn.zuo.web;

import cn.zuo.web.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hui.zuo@transsnet.com
 * @date 2021/12/1
 * @description:
 */
@RestController
public class TestController {

    @Autowired
    TestFeign feign;


    @GetMapping("/user/get")
    public String getUser1(String param){
        return "user->" + param;
    }

    @GetMapping("/auth/user/{param}")
    public String getUser(@PathVariable("param") String param){
        return feign.doGetUser(param);
    }

    @GetMapping("/test")
    public String test(HttpServletResponse response) throws IOException {
        response.setStatus(429);
//        response.getWriter().write("111111111111");
        return "ashjkashajk";
    }

}
