package swa.productservicec.infrastructure.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import swa.productservicec.domain.data.ProductDto;
import swa.productservicec.domain.ports.spi.ProductPersistencePort;
import swa.productservicec.infrastructure.entity.Product;
import swa.productservicec.infrastructure.mappers.ProductMapperImpl;
import swa.productservicec.infrastructure.repository.IProductRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductPersistanceImpl implements ProductPersistencePort {
    @Autowired
    private IProductRepository repository;

    @Override
    public ProductDto addProduct(ProductDto dtoModel) {
        ProductMapperImpl ProductMapper = new ProductMapperImpl();
        Product Product = ProductMapper.ProductDtoToProduct(dtoModel);
        Product ProductSaved = repository.save(Product);
        return ProductMapper.ProductToProductDto(ProductSaved);
    }



    @Override
    public void deleteProductById(long id) {
        Optional<Product> Product=repository.findById(id);
        repository.deleteById(Product.get().getId());
    }

    @Override
    public ProductDto updateProduct(ProductDto ProductDto) {

        return addProduct(ProductDto);
    }

    @Override
    public List<ProductDto> getProducts() {
        List<Product> ProductList = repository.findAll();
        ProductMapperImpl ProductMapper = new ProductMapperImpl();
        List<ProductDto> ProductDtoList = ProductMapper.ProductListToProductDtoList(ProductList);
        return ProductDtoList;
    }

    @Override
    public ProductDto getProductById(long id) {
        ProductMapperImpl ProductMapper = new ProductMapperImpl();
        Optional<Product> Product = repository.findById(id);
        if (Product.isPresent()) {
            return ProductMapper.ProductToProductDto(Product.get());
        }
        return null;
    }
}
