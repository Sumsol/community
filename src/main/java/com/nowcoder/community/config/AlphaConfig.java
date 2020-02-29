package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

// 因为无法在第三方的类上加Bean扫描注解，因此需要配置类来装配第三方的Bean。
@Configuration
public class AlphaConfig {

    // @Bean注解的方法用于将第三方的类实例化生成Bean装配到Spring容器中。
    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
