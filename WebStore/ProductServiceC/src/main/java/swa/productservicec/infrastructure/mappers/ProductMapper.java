package swa.productservicec.infrastructure.mappers;

import swa.productservicec.domain.data.ProductDto;
import swa.productservicec.infrastructure.entity.Product;

import java.util.List;

public interface ProductMapper {
    ProductDto ProductToProductDto(Product Product);

    Product ProductDtoToProduct(ProductDto ProductDto);

    List<ProductDto> ProductListToProductDtoList(List<Product> ProductList);

    List<Product> ProductDtoListToProductList(List<ProductDto> ProductDtoList);
}
