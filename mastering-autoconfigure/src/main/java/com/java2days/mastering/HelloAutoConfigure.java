package com.java2days.mastering;

import com.java2days.mastering.service.HelloService;
import com.java2days.mastering.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloService.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfigure {

    @Autowired
    private HelloProperties helloProperties;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    @ConditionalOnProperty(prefix = "hello", value = "name")
    public HelloService helloService(){
        return new HelloServiceImpl(helloProperties.getName());
    }

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloServiceNoProperty(){
        return new HelloServiceImpl("Default Service");
    }

}
