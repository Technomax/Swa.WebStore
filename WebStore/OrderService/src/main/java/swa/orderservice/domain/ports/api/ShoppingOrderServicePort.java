package swa.orderservice.domain.ports.api;

import swa.orderservice.domain.data.ProductDto;
import swa.orderservice.domain.data.ShoppingCartDto;
import swa.orderservice.domain.data.ShoppingOrderDto;

import java.util.List;

public interface ShoppingOrderServicePort {
    ShoppingOrderDto createShoppingOrder(long orderId, ShoppingCartDto dtoModel);

    void deleteShoppingOrderById(long id);

    ShoppingOrderDto updateShoppingOrder(ShoppingOrderDto dtoModel);

    List<ShoppingOrderDto> getShoppingOrders();

    ShoppingOrderDto getShoppingOrderById(long id);

}
