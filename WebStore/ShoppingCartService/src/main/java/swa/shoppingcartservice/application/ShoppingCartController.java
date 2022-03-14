package swa.shoppingcartservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import swa.shoppingcartservice.domain.data.ProductDto;
import swa.shoppingcartservice.domain.data.ShoppingCartDto;
import swa.shoppingcartservice.domain.ports.api.ShoppingCartServicePort;
import swa.shoppingcartservice.infrastructure.utility.SequenceGeneratorService;

import java.util.List;

@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartServicePort servicePort;

    private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public ShoppingCartController(SequenceGeneratorService sequenceGenerator)
    {
        this.sequenceGenerator=sequenceGenerator;
    }

    @PostMapping("/create")
    public ShoppingCartDto create(@RequestBody ShoppingCartDto dtoModel) {
        dtoModel.setId(sequenceGenerator.generateSequence("ShoppingCart_sequence"));
        return servicePort.addShoppingCart(dtoModel);
    }

    @PutMapping("/addproduct/{cart}")
    public ShoppingCartDto addProduct(@PathVariable long cart, @RequestBody ProductDto productDto) {
        return servicePort.addProduct(cart, productDto);
    }

    @DeleteMapping("/removeproduct/{cart}")
    public ShoppingCartDto removeProduct(@PathVariable long cart, @RequestBody ProductDto productDto) {
        return servicePort.removeProduct(cart, productDto);
    }

    @PutMapping("/changequantity/{cart}")
    public ShoppingCartDto changeQuantity(@PathVariable long cart, @RequestBody ProductDto productDto) {
        return servicePort.updateProduct(cart, productDto);
    }

    @GetMapping("/view/{id}")
    public ShoppingCartDto get(@PathVariable long id) {
        return servicePort.getShoppingCartById(id);
    }
}
