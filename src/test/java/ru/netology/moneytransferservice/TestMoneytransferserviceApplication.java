package ru.netology.moneytransferservice;

import org.springframework.boot.SpringApplication;

public class TestMoneytransferserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(MoneytransferserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
