package sample.spring.ch0101.bankapp;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class BankApp {

	private static Logger logger = Logger.getLogger(BankApp.class);

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
        FixedDepositController fixedDepositController = (FixedDepositController) context.getBean("controller");

        logger.info("Submission status of fixed deposit : " + fixedDepositController.submit());
        logger.info("Returned fixed deposit info : " + fixedDepositController.get());
    }
}
