package com.luobo.starter.config;

import com.luobo.starter.properties.LuoboProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(LuoboProperties.class)
@Import({LuoboServiceAutoConfiguration.class})
public class LuoboAutoConfiguration {
}
