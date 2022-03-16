package swa.productloanbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductLoadBalanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductLoadBalanceApplication.class, args);
    }

}
