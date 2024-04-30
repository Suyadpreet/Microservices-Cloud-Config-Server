package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicesCloudConfigServerApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroservicesCloudConfigServerApplication.class, args);
		System.out.println("Cloud-Config-Server Application has been started.............");
	}

}
