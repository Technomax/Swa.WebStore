package swa.shoppingcartservice.infrastructure.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import swa.shoppingcartservice.domain.data.ShoppingCartDto;

public interface ISender {
    String stringObject(ShoppingCartDto shoppingDto) throws JsonProcessingException;
    void send(String topic, String cartDto);
}
