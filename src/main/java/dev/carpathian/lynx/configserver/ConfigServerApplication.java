package dev.carpathian.lynx.configserver;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(ConfigServerApplication.class, args);
		System.out.println(List.of(context.getEnvironment().getActiveProfiles()));
	}

}
