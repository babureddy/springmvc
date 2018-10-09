package com.employee.model.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.employee.model.autowire.interfaces.CompactDisc;
import com.employee.model.autowire.interfaces.impl.BlankDisc;
import com.employee.model.autowire.interfaces.impl.SgtPeppers;


@Configuration
public class CDPlayerConfig {

     @Bean
     public CompactDisc getBlankDisc() {
         return new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band", "The Bearleeees");
     }
}
