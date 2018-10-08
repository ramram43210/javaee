package com.ram.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Annotate with @Configuration to tell Spring that this is the core
 * Spring configuration file, and define bean via @Bean.
 */
@Configuration
@Import({EmployeeConfig.class})
public class ApplicationBeans
{

}