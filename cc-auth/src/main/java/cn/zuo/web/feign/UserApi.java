package cn.zuo.web.feign;

import feign.Param;
import feign.RequestLine;

public interface UserApi {

    @RequestLine(value = "GET /user/get?param={param}")
    String getUser(@Param("param") String param);

}
