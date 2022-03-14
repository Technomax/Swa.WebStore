package swa.productservice.infrastructure.mappers;

import swa.productservice.domain.data.ProductDto;
import swa.productservice.infrastructure.entity.Product;

import java.util.List;

public interface ProductMapper {
    ProductDto ProductToProductDto(Product Product);

    Product ProductDtoToProduct(ProductDto ProductDto);

    List<ProductDto> ProductListToProductDtoList(List<Product> ProductList);

    List<Product> ProductDtoListToProductList(List<ProductDto> ProductDtoList);
}
