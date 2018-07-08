package cn.com.ljl.platformadmin.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorConfig()).addPathPatterns("/auth/**");
    }

    @Bean
    public InterceptorConfig interceptorConfig() {
        return new InterceptorConfig();
    }

}
