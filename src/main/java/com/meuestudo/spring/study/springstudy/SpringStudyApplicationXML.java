package com.meuestudo.spring.study.springstudy;

import com.meuestudo.spring.study.xml.XmlPersonDAO;
import  org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringStudyApplicationXML {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringStudyApplicationXML.class);

    public static void main(String[] args) {
        //Xml Application Context
        try(ClassPathXmlApplicationContext applicationContext  = new ClassPathXmlApplicationContext("applicationContext.xml")){

            XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

            XmlPersonDAO personDAO2 = applicationContext.getBean(XmlPersonDAO.class);
            LOGGER.info("{} {}", personDAO, personDAO.getJdbcConnection());

            LOGGER.info("{} {}", personDAO2, personDAO2.getJdbcConnection());

            LOGGER.info("-> {}", (Object) applicationContext.getBeanDefinitionNames());

        }
    }
}
