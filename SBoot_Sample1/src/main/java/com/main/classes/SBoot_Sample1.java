package com.main.classes;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SBoot_Sample1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "SpringBoot Working");
		ConfigurableApplicationContext ctx = SpringApplication.run(SBoot_Sample1.class, args);
		//ctx.getBean(TerminateBean.class);
		ctx.close();
	}

}
