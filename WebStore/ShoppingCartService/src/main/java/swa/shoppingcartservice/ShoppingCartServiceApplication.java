package swa.shoppingcartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingCartServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartServiceApplication.class, args);
    }

}
