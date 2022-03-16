package swa.shoppingcartviewer.infrastructure.mappers;


import swa.shoppingcartviewer.domain.data.ShoppingCartDto;
import swa.shoppingcartviewer.infrastructure.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartMapper {
    ShoppingCartDto ShoppingCartToShoppingCartDto(ShoppingCart ShoppingCart);

    ShoppingCart ShoppingCartDtoToShoppingCart(ShoppingCartDto ShoppingCartDto);

    List<ShoppingCartDto> ShoppingCartListToShoppingCartDtoList(List<ShoppingCart> ShoppingCartList);

    List<ShoppingCart> ShoppingCartDtoListToShoppingCartList(List<ShoppingCartDto> ShoppingCartDtoList);
}
