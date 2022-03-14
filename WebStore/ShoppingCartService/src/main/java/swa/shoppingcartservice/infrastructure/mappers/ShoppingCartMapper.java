package swa.shoppingcartservice.infrastructure.mappers;

import swa.shoppingcartservice.domain.data.ShoppingCartDto;
import swa.shoppingcartservice.infrastructure.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartMapper {
    ShoppingCartDto ShoppingCartToShoppingCartDto(ShoppingCart ShoppingCart);

    ShoppingCart ShoppingCartDtoToShoppingCart(ShoppingCartDto ShoppingCartDto);

    List<ShoppingCartDto> ShoppingCartListToShoppingCartDtoList(List<ShoppingCart> ShoppingCartList);

    List<ShoppingCart> ShoppingCartDtoListToShoppingCartList(List<ShoppingCartDto> ShoppingCartDtoList);
}
