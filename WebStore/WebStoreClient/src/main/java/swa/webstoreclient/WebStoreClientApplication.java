package swa.webstoreclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import swa.webstoreclient.data.*;


@SpringBootApplication
public class WebStoreClientApplication implements CommandLineRunner {
    @Autowired
    @Lazy
    private RestOperations restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(WebStoreClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Adding Product");
//        System.out.println("===============");
//        restTemplate.postForLocation("http://localhost:8080/product/add",
//                new ProductDto(8, "D-001", "Dell", 1000, true, 5.5, "Laptop", 10, null));
//        System.out.println("Added::" + restTemplate.getForObject("http://localhost:8080/product/view/8", ProductDto.class));
//        System.out.println("=======");
//        restTemplate.postForLocation("http://localhost:8080/product/add",
//                new ProductDto(9, "D-002", "Headset", 10, true, 10, "Headset", 10, null));
//        System.out.println("Added::" + restTemplate.getForObject("http://localhost:8080/product/view/9", ProductDto.class));
//        System.out.println("\nModify Product");
//        System.out.println("===============");
//        restTemplate.put("http://localhost:8080/product/update",
//                new ProductDto(8, "D-001", "Dell", 1000 * 0.01, true, 5.5, "Laptop with latest gen", 10, null));
//        System.out.println("Updated::" + restTemplate.getForObject("http://localhost:8080/product/view/9", ProductDto.class));
//        System.out.println("=======");
//        restTemplate.put("http://localhost:8080/product/update",
//                new ProductDto(9, "D-002", "Headset", 10 * 0.01, true, 10, "Headset - black in color", 10, null));
//        System.out.println("Updated::" + restTemplate.getForObject("http://localhost:8080/product/view/9", ProductDto.class));
//        System.out.println("\nGet all products");
//        System.out.println("===============");
//        ProductDto[] product = restTemplate.getForObject("http://localhost:8080/product/list", ProductDto[].class);
//        System.out.println(Arrays.asList(product));
//        System.out.println("========================================================================================");
//        System.out.println("Creating cart and adding product to the cart");
//        System.out.println("===============");
//        restTemplate.postForLocation("http://localhost:8080/shoppingcart/create",
//                new ShoppingCartDto(3, new CustomerDto(2, "Anil", "Maharjan", new AddressDto("1000 N", "Fairfield", "IOWA"),
//                        "641", "Anil.maharjan@gmail.com"), new ArrayList<ProductDto>() {{
//                    add(new ProductDto(9, "D-002", "Headset", 10, true, 10, "Headset", 10, null));
//                }}, null), ShoppingCartDto.class);
//        System.out.println("New cart::" + restTemplate.getForObject("http://localhost:8080/shoppingcart/view/4", ShoppingCartDto.class));
//        restTemplate.put("http://localhost:8080/shoppingcart/addproduct/4",
//                new ProductDto(8, "D-001", "Dell", 1000, true, 5.5, "Laptop", 10, null));
//        System.out.println("Showing the cart");
//        System.out.println("===============");
//        System.out.println("Cart::" + restTemplate.getForObject("http://localhost:8080/shoppingcart/view/4", ShoppingCartDto.class));
//        System.out.println("remove product from the cart (Request body is not allowed with delete. However it working with postman)");
//      http://localhost:8080/shoppingcart/removeproduct/4
//        {
//            "id":8,
//                "productNumber":"D-001",
//                "name":"Dell",
//                "price":1000,
//                "taxable":true,
//                "applicableDiscount":5.5,
//                "description":"Laptop",
//                "quantity":10,
//                "status":null
//        }
//        System.out.println("changing quantity");
//        restTemplate.put("http://localhost:8080/shoppingcart/addproduct/4",
//                new ProductDto(8, "D-001", "Dell", 1000, true, 5.5, "Laptop", 100, null));
//        System.out.println("Showing the updated shopping cart::" + restTemplate.getForObject("http://localhost:8080/shoppingcart/view/4", ShoppingCartDto.class));

//        System.out.println("Check out cart");
//        ShoppingCartDto cartDto=restTemplate.getForObject("http://localhost:8080/shoppingcart/view/4", ShoppingCartDto.class);
//        restTemplate.put("http://localhost:8080/shoppingcart/checkout/4",cartDto);

          System.out.println("Showing the placed order");
        System.out.println("Order:" + restTemplate.getForObject("http://localhost:8080/order/view/4", ShoppingOrderDto.class));

    }
    @Bean
    RestOperations restTemplate() {
        return new RestTemplate();
    }
}
