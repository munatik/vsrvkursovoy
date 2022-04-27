package ru.mirea.smokeandgasalarmsystem.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Smoke and gas alarm system module")
                        .description("App emulates sensor data and sends info about critical situations into alarm actuator")
                        .version("v0.0.1")
                        .contact(new Contact().name("Abdrakhman Aitiyev").url("https://t.me/a_knight_a").email("a_aitiev@list.ru"))
                        .license(new License().name("RTU MIREA").url("http://mirea.ru")));
    }
}
