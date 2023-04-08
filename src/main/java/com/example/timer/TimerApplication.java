package com.example.timer;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class TimerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimerApplication.class, args);
	}
	
	@Component
	class TimerRoute extends RouteBuilder {

		@Override
		public void configure() throws Exception {
			from("timer:my-timer?period=5000")
					.log("Hora: ${date:now:HH:mm:ss}");
			
		}
		
	}

}
