package com.example.TravelCard.service.startupService.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import com.example.TravelCard.service.startupService.IApplicationStartupService;


@Service("applicationStaryupServiceImpl")
public class ApplicationStaryupServiceImpl implements IApplicationStartupService, ApplicationContextAware {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationStaryupServiceImpl.class);
	private ApplicationContext applicationContext;

	@Override
	public void loadAllCache() {
		LOG.info("Inside loadAllCache Function...");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
		
	}

}
