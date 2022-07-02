package de.ngoldack.statsforbrett;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;

@SpringBootApplication
@Log
public class StatsforbrettApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatsforbrettApplication.class, args);
		log.log(Level.INFO,"Hello World!");
	}

}
