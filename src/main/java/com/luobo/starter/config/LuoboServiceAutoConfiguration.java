package com.luobo.starter.config;

import com.luobo.starter.properties.LuoboProperties;
import com.luobo.starter.service.LuoboService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LuoboServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public LuoboService wxMpService(LuoboProperties luoboProperties) {
        LuoboService luoboService=new LuoboService();
        luoboService.setLuoboProperties(luoboProperties);
        return luoboService;
    }

}
