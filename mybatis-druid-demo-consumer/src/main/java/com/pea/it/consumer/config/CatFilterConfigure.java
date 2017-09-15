package com.pea.it.consumer.config;

import com.dianping.cat.servlet.CatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * CatFilterConfigure
 *
 * @author ChenHuiMin@saicmotor.com
 * @date 2017-09-14 19:18
 */
@Configuration
public class CatFilterConfigure {
    @Bean
    public FilterRegistrationBean catFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        CatFilter filter = new CatFilter();
        registration.setFilter(filter);
        registration.addUrlPatterns("/api/*");

        //   registration.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        registration.setName("cat-filter");
        registration.setOrder(1);
        return registration;
    }
}
