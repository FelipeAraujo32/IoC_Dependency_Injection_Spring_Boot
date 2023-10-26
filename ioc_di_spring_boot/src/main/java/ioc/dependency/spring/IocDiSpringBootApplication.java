package ioc.dependency.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ioc.dependency.spring.ioc_di_spring_boot.services.PlayService;

@SpringBootApplication
public class IocDiSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(IocDiSpringBootApplication.class, args);
	}

	@Autowired
	private PlayService playService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RESULTADO = " + playService.finalPrice(300.0, "Sul"));
	}
}
