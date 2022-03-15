package swa.productservicec.infrastructure.mappers;

import org.modelmapper.ModelMapper;
import swa.productservicec.domain.data.ProductDto;
import swa.productservicec.infrastructure.entity.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto ProductToProductDto(Product Product) {
        ModelMapper mapper = new ModelMapper();
        ProductDto dto = mapper.map(Product, ProductDto.class);
        return dto;
    }

    @Override
    public Product ProductDtoToProduct(ProductDto ProductDto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(ProductDto, Product.class);
    }

    @Override
    public List<ProductDto> ProductListToProductDtoList(List<Product> ProductList) {
        return ProductList.stream().map(Product -> ProductToProductDto(Product)).collect(Collectors.toList());
    }

    @Override
    public List<Product> ProductDtoListToProductList(List<ProductDto> ProductDtoList) {
        return ProductDtoList.stream().map(ProductDto -> ProductDtoToProduct(ProductDto)).collect(Collectors.toList());
    }
}
