package swa.productservice.domain.ports.api;

import swa.productservice.domain.data.ProductDto;

import java.util.List;

public interface ProductServicePort {
    ProductDto addProduct(ProductDto dtoModel);

    void deleteProductById(long id);

    ProductDto updateProduct(ProductDto dtoModel);

    List<ProductDto> getProducts();

    ProductDto getProductById(long id);

}
