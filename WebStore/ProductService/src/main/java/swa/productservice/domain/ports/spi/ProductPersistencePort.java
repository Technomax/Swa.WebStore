package swa.productservice.domain.ports.spi;

import swa.productservice.domain.data.ProductDto;

import java.util.List;

public interface ProductPersistencePort {
    ProductDto addProduct(ProductDto dtoModel);

    void deleteProductById(long id);

    ProductDto updateProduct(ProductDto dtoModel);

    List<ProductDto> getProducts();

    ProductDto getProductById(long id);
}
