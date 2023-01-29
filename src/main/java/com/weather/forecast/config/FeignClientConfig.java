package com.weather.forecast.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author hfredi35@gmail.com
 */
public class FeignClientConfig {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Accept", "application/json");
            requestTemplate.header("Content-Type", "application/json");
        };
    }
}
