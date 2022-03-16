package swa.shoppingcartviewer.infrastructure.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import swa.shoppingcartviewer.domain.data.ShoppingCartDto;
import swa.shoppingcartviewer.domain.ports.spi.ShoppingCartPersistencePort;
import swa.shoppingcartviewer.infrastructure.repository.IShoppingCartRepository;

@Service
public class Receiver {

    @Autowired
    ShoppingCartPersistencePort persistence;

    @KafkaListener(topics = {"topicShoppingCart"})
    public void receive(@Payload String message) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ShoppingCartDto cart = objectMapper.readValue(message, ShoppingCartDto.class);
            persistence.updateShoppingCart(cart);
            System.out.println("Receiver received message= " + cart);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("Receiver received message= " + message);
    }

}