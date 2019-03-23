package com.example.TravelCard.config.repository.master;

import java.util.Properties;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class MasterRepositoryConfig {
	
	private static final Logger LOG = LoggerFactory.getLogger(MasterRepositoryConfig.class);

	@Value("${spring.datasource.driverClassName}")
	private String driver;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.url}")
	private String dbUrl;

	@Value("${spring.datasource.username}")
	private String userName;

	@Value("${spring.jpa.database-platform}")
	private String dialect;

	@Value("${spring.jpa.properties.hibernate.show_sql}")
	private String showSQL;

	@Value("${entitymanager.packagesToScan}")
	private String packagesToScan;

	@Bean
	public DataSource dataSource() {
		LOG.info("Inside dataSource function...");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(dbUrl);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LOG.info("Session Factory.. LocalSessionFactoryBean...");
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(packagesToScan);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", dialect);
		hibernateProperties.put("hibernate.show_sql", showSQL);
		sessionFactory.setHibernateProperties(hibernateProperties);
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		LOG.info("Transaction Manager..... transactionManager...");
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}

}
