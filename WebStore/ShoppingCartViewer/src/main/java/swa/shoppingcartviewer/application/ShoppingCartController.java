package swa.shoppingcartviewer.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import swa.shoppingcartviewer.domain.data.ShoppingCartDto;
import swa.shoppingcartviewer.domain.ports.api.ShoppingCartServicePort;

import java.util.List;

@RestController
@RequestMapping("/shoppingcartviewer")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartServicePort servicePort;

    @GetMapping("/list")
    public List<ShoppingCartDto> gets() throws JsonProcessingException {
        return servicePort.getShoppingCarts();
    }

    @GetMapping("/view/{id}")
    public ShoppingCartDto get(@PathVariable long id) throws JsonProcessingException {
        return servicePort.getShoppingCartById(id);
    }
}
