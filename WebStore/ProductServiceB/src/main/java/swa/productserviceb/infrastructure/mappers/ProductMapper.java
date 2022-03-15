package swa.productserviceb.infrastructure.mappers;

import swa.productserviceb.domain.data.ProductDto;
import swa.productserviceb.infrastructure.entity.Product;

import java.util.List;

public interface ProductMapper {
    ProductDto ProductToProductDto(Product Product);

    Product ProductDtoToProduct(ProductDto ProductDto);

    List<ProductDto> ProductListToProductDtoList(List<Product> ProductList);

    List<Product> ProductDtoListToProductList(List<ProductDto> ProductDtoList);
}
