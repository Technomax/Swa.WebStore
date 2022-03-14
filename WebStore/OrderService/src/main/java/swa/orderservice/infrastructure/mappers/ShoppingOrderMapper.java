package swa.orderservice.infrastructure.mappers;

import swa.orderservice.domain.data.ShoppingOrderDto;
import swa.orderservice.infrastructure.entity.ShoppingOrder;

import java.util.List;

public interface ShoppingOrderMapper {
    ShoppingOrderDto ShoppingOrderToShoppingOrderDto(ShoppingOrder ShoppingOrder);

    ShoppingOrder ShoppingOrderDtoToShoppingOrder(ShoppingOrderDto ShoppingOrderDto);

    List<ShoppingOrderDto> ShoppingOrderListToShoppingOrderDtoList(List<ShoppingOrder> ShoppingOrderList);

    List<ShoppingOrder> ShoppingOrderDtoListToShoppingOrderList(List<ShoppingOrderDto> ShoppingOrderDtoList);
}
