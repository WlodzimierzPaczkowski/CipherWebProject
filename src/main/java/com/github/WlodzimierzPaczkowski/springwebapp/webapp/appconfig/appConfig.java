


package com.github.WlodzimierzPaczkowski.springwebapp.webapp.appconfig;// package com.github.WlodzimierzPaczkowski.springwebapp.webapp.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.github.WlodzimierzPaczkowski.springwebapp.webapp",})
@PropertySource("application.properties")
public class appConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
