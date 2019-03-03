package com.example.TravelCard.config.controllerinitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.example.TravelCard.config.initialize.ApplicationConfig;

public class ControllerMapper extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	/*
	 * @author : Rohit Saraf
	 * Version 1, March 3 2018
	 * 
	 * */
	
	private static final Logger LOG = LoggerFactory.getLogger(ControllerMapper.class);

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		LOG.info("Inside mapping Applicatiion Config class....{}");
		return new Class[] {ApplicationConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		LOG.info("Inside servlet mapping function of controllerMapper class ....");
		return new String[] {"/home","/payment","/api"};
	}

}
