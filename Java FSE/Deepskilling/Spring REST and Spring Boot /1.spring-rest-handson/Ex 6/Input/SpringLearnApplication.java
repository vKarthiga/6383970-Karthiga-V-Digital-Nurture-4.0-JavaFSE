Location: src/main/java/com/cognizant/springlearn/SpringLearnApplication.java

package com.cognizant.springlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START main()");
        SpringApplication.run(SpringLearnApplication.class, args);
        displayCountries();
        LOGGER.info("END main()");
    }

    public static void displayCountries() {
        LOGGER.info("START displayCountries()");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        List<Country> countries = context.getBean("countryList", List.class);

        for (Country country : countries) {
            LOGGER.debug("Country: {}", country.toString());
        }

        LOGGER.info("END displayCountries()");
    }
}
