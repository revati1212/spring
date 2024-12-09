package com.xworks.train_iniz;

import com.xworks.train_config.TrainConfig;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.security.auth.login.Configuration;

public class TrainI_Iniz extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
            TrainConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("configured  for DispatcherService");
        return new String[]{};
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("defaultservlethandler");
        configurer.enable();
    }

}
