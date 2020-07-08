package com.capgem.dev.spring.autowiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackageClasses= Student.class)//we should not use base packages as if we change the package name then it will not  able to find if we give base package classes then  even if we change the package name it will be able to scann all the classes as we gave class name .
public class Studentconfig {

}
