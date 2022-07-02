package de.ngoldack.statsforbrett;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Level;

@SpringBootTest
@Log
class StatsforbrettApplicationTests {

	@Test
	void contextLoads() {
		log.log(Level.INFO, "Test");
	}

}
