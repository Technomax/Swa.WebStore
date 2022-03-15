package swa.productservicec.domain.ports.api;


import swa.productservicec.domain.data.ProductDto;

import java.util.List;

public interface ProductServicePort {
    ProductDto addProduct(ProductDto dtoModel);

    void deleteProductById(long id);

    ProductDto updateProduct(ProductDto dtoModel);

    List<ProductDto> getProducts();

    ProductDto getProductById(long id);

}
