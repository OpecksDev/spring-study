package com.meuestudo.spring.basico.springstudy;

import com.meuestudo.spring.basico.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.meuestudo.spring.basico.scope")
public class SpringStudyApplicationScope {


    private static final Logger LOGGER = LoggerFactory.getLogger(SpringStudyApplicationScope.class);

    public static void main(String[] args) {
        //application context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringStudyApplicationScope.class);//SpringApplication.run(SpringStudyApplicationScope.class, args);
        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());

        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());

    }
}
