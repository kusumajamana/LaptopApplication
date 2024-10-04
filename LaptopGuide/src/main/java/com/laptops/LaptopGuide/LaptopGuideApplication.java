package com.laptops.LaptopGuide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.laptops.Laptop_Guide", "com.speedment.jpastreamer"})
public class LaptopGuideApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopGuideApplication.class, args);
	}

}
