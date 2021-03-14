package com.hxc.springboot03.config;

import com.hxc.springboot03.interceptor.Interceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/23
 * Time: 15:58
 */
@Configuration

public class AdminConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor())
                .addPathPatterns("/**") // /**表示拦截所有路劲
                .excludePathPatterns("/","/css/**"); // 放行的路径
    }
}
