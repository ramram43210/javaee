package com.ram.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ EmployeeConfig.class, CustomerConfig.class })
public class AppConfig
{

}