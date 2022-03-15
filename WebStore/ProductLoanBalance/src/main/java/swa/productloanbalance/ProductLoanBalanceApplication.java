package swa.productloanbalance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductLoanBalanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductLoanBalanceApplication.class, args);
    }

}
