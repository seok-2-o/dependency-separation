package edu.seok2.presentation.configuration;

import edu.seok2.domain.product.application.ProductQueryService;
import edu.seok2.domain.product.repository.ProductReader;
import edu.seok2.storage.product.InMemoryProductReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {


    @Bean
    public ProductQueryService productQueryService() {
        return new ProductQueryService(productReader());
    }

    @Bean
    public ProductReader productReader() {
        return new InMemoryProductReader();
    }

}
