package swa.orderservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import swa.orderservice.domain.data.ShoppingCartDto;
import swa.orderservice.domain.data.ShoppingOrderDto;
import swa.orderservice.domain.ports.api.ShoppingOrderServicePort;
import swa.orderservice.infrastructure.utility.SequenceGeneratorService;

@RestController
@RequestMapping("/order")
public class ShoppingOrderController {
    @Autowired
    private ShoppingOrderServicePort servicePort;

    private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public ShoppingOrderController(SequenceGeneratorService sequenceGenerator)
    {
        this.sequenceGenerator=sequenceGenerator;
    }

    @PostMapping("/create")
    public ShoppingOrderDto create(@RequestBody ShoppingCartDto dtoModel) {
        return servicePort.createShoppingOrder(sequenceGenerator.generateSequence("ShoppingOrder_sequence"),dtoModel);
    }


    @GetMapping("/view/{id}")
    public ShoppingOrderDto get(@PathVariable long id) {
        return servicePort.getShoppingOrderById(id);
    }
}
