package com.springbootwstest.ns;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringbootwstestMain extends SpringBootServletInitializer implements WebApplicationInitializer{
	
	private static final Logger logger=LoggerFactory.getLogger(SpringbootwstestMain.class);

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringbootwstestMain.class).run(args);
	}

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		logger.info("Set system property spring.profiles.active to PROD");
		System.setProperty("spring.profiles.active", "PROD");
		super.onStartup(servletContext);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootwstestMain.class);
    }
	
}