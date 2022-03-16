package swa.shoppingcartviewer.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swa.shoppingcartviewer.domain.data.ProductDto;
import swa.shoppingcartviewer.domain.data.ShoppingCartDto;
import swa.shoppingcartviewer.domain.ports.api.ShoppingCartServicePort;
import swa.shoppingcartviewer.domain.ports.spi.ShoppingCartPersistencePort;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartServicePort {

    @Autowired
    private ShoppingCartPersistencePort persistencePort;

    @Override
    public ShoppingCartDto addShoppingCart(ShoppingCartDto dtoModel) {
        ShoppingCartDto ShoppingCartDTO=persistencePort.addShoppingCart(dtoModel);
        return ShoppingCartDTO;
    }

    @Override
    public ShoppingCartDto addProduct(long cartId, ProductDto dtoModel){
        ShoppingCartDto cartModel = persistencePort.getShoppingCartById(cartId);
        cartModel.addProduct(dtoModel);
        return persistencePort.updateShoppingCart(cartModel);
    }

    @Override
    public ShoppingCartDto removeProduct(long cartId, ProductDto dtoModel){
        ShoppingCartDto cartModel = persistencePort.getShoppingCartById(cartId);
        cartModel.removeProduct(dtoModel);
        return persistencePort.updateShoppingCart(cartModel);
    }

    @Override
    public ShoppingCartDto updateProduct(long cartId, ProductDto dtoModel){
        ShoppingCartDto cartModel = persistencePort.getShoppingCartById(cartId);
        cartModel.updateProduct(dtoModel);
        return persistencePort.updateShoppingCart(cartModel);
    }

    @Override
    public void deleteShoppingCartById(long id) {
        persistencePort.deleteShoppingCartById(id);
    }

    @Override
    public ShoppingCartDto updateShoppingCart(ShoppingCartDto dtoModel) {
        return persistencePort.updateShoppingCart(dtoModel);
    }

    @Override
    public List<ShoppingCartDto> getShoppingCarts() {
        return persistencePort.getShoppingCarts();
    }

    @Override
    public ShoppingCartDto getShoppingCartById(long id) {
        return persistencePort.getShoppingCartById(id);
    }
}
