package com.Analyse_sentiment.appConfig;


import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.Analyse_sentiment.bo.Comment;
import com.Analyse_sentiment.bo.Post;
import com.Analyse_sentiment.bo.User;



@Configuration
@ComponentScan(basePackages = {"com.Analyse_sentiment.actions"  ,"com.Analyse_sentiment.service.impl",
		"com.Analyse_sentiment.dao","com.Analyse_sentiment.service"})
@EnableTransactionManagement
public class AppConfig {

	private static final Logger LOGGER = Logger.getLogger(AppConfig.class);

	public AppConfig() {

		LOGGER.debug(" configuration init...");
	}

	@Autowired
	SessionFactory sessionFactory;

	@Bean
	@Autowired
	public HibernateTemplate hibernateTemplate(final SessionFactory sessionFactory) {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(sessionFactory);

		if (hibernateTemplate != null) {
			LOGGER.debug(" HibernateTemplate created ...");
		}

		return hibernateTemplate;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {

		final LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setHibernateProperties(hibernateProperties());

		sessionFactory.setAnnotatedClasses(
		User.class,
		Comment.class,
		Post.class		
		);
		
		//mhode tester setAnnotatedPackages("com.bo");

		if (sessionFactory != null) {
			LOGGER.debug(" sessionFactory created ...");
		}
		return sessionFactory;
	}

	final Properties hibernateProperties() {

		final Properties hibernateProperties = new Properties();

		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");

		return hibernateProperties;
	}

	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		
//		dataSource.setUrl("jdbc:mysql://localhost:3306/ecomerce");
		dataSource.setUrl("jdbc:mysql://localhost/Analyse_Sentiment?verifyServerCertificate=false&useSSL=true");	
		dataSource.setUsername("root");
		dataSource.setPassword("TNCAP94847D");
		return dataSource;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(final SessionFactory sessionFactory) {
		final HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		if (txManager != null) {
			LOGGER.debug(" Hibernate Transaction Manager created ...");

		}

		return txManager;

	}
}