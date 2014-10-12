package survey.client.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import survey.service.IStatisticsService;

public class AppSS {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("client.xml");
		IStatisticsService ss = (IStatisticsService) ac.getBean("ssClient");
		ss.statistics(50);
	}

}
