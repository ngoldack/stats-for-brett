package de.ngoldack.statsforbrett.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI dunkelweicheOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("stats-for-brett")
                        .description("stats-for-brett REST-API")
                        .version("1.0.0")
                        .contact(new Contact().name("Nicolas Goldack").email("nicolas-goldack@live.de"))
                );
    }
}
