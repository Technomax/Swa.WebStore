package swa.productserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceBApplication.class, args);
    }

}
