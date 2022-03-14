package swa.productservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import swa.productservice.domain.data.ProductDto;
import swa.productservice.domain.ports.api.ProductServicePort;
import swa.productservice.infrastructure.utility.SequenceGeneratorService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServicePort servicePort;

    private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public ProductController(SequenceGeneratorService sequenceGenerator)
    {
        this.sequenceGenerator=sequenceGenerator;
    }

    @PostMapping("/add")
    public ProductDto create(@RequestBody ProductDto dtoModel) {
        dtoModel.setId(sequenceGenerator.generateSequence("product_sequence"));
        return servicePort.addProduct(dtoModel);
    }

    @PutMapping("/update")
    public ProductDto update(@RequestBody ProductDto ProductDto) {
        return servicePort.addProduct(ProductDto);
    }

    @DeleteMapping("/remove/{id}")
    public void delete(@PathVariable long id) {
        servicePort.deleteProductById(id);
    }

    @GetMapping("/list")
    public List<ProductDto> gets() {
        return servicePort.getProducts();
    }

    @GetMapping("/view/{id}")
    public ProductDto get(@PathVariable long id) {
        return servicePort.getProductById(id);
    }
}
