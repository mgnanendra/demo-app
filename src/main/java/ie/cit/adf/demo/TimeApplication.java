package ie.cit.adf.demo;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TimeApplication {
	public static void main(String[] args) {
		System.out.println("Time Application.");

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:context-config.xml");

		TimeService serviceImpl = (TimeService) ctx.getBean("TimeService");
		Date currentDate = serviceImpl.getCurrentDate();
		System.out.println(currentDate);
	}
}
