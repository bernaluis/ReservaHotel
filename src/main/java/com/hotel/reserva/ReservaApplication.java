package com.hotel.reserva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.hotel.reserva"})
public class ReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservaApplication.class, args);
	}

}
