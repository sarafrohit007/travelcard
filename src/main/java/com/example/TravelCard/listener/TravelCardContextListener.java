package com.example.TravelCard.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Component
public class TravelCardContextListener implements ServletContextListener{

	private static final Logger LOG = LoggerFactory.getLogger(TravelCardContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOG.info("Initializing TravelCard Context...");
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
        
        try {
            
        } catch (Exception e) {
            LOG.error("Error while initializing application ", e);
            return;
        }

        LOG.info("Scheduling next cache reload...");
        
        LOG.info("lybrate Context Initialized Successfully.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // nothing needed here
    }
}
