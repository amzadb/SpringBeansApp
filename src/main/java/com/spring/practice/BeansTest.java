package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.TeamDC;
import com.spring.beans.TeamMI;
import com.spring.beans.TeamSRH;

public class BeansTest {

	public static void main(String[] args) {
		// Method 1
		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(BeansConfig.class);

		// Method 2
		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// context.register(BeansConfig.class);
		// context.refresh();

		// IPLService service = context.getBean(IPLService.class);
		// IPLTeam team = service.newTeam();
		// System.out.println(team);

		// Method 3
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		TeamSRH teamHyd = (TeamSRH) context.getBean("teamHyd");
		System.out.println(teamHyd);

		TeamMI teamMumbai = (TeamMI) context.getBean("teamMumbai");
		System.out.println(teamMumbai);
		
		TeamDC teamDelhi = (TeamDC) context.getBean("teamDelhi");
		System.out.println(teamDelhi);
	}

}
