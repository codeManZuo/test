package cn.zuo.web.feign;

import feign.Feign;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

/**
 * @author hui.zuo@transsnet.com
 * @date 2021/12/1
 * @description:
 */
@Component
public class TestFeign {

    ErrorDecoder errorDecoder = new ErrorDecoder() {
        @Override
        public Exception decode(String methodKey, Response response) {
            return null;
        }
    };

    UserApi userApi = Feign.builder()
            .errorDecoder(errorDecoder)
            .target(UserApi.class, "http://localhost:9528");

    public String doGetUser(String param){
        return userApi.getUser(param);
    }

}
