package swa.productservicec.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swa.productservicec.domain.data.ProductDto;
import swa.productservicec.domain.ports.api.ProductServicePort;
import swa.productservicec.domain.ports.spi.ProductPersistencePort;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductServicePort {

    @Autowired
    private ProductPersistencePort persistencePort;

    @Override
    public ProductDto addProduct(ProductDto dtoModel) {
        ProductDto ProductDTO=persistencePort.addProduct(dtoModel);
        return ProductDTO;
    }

    @Override
    public void deleteProductById(long id) {
        persistencePort.deleteProductById(id);
    }

    @Override
    public ProductDto updateProduct(ProductDto dtoModel) {
        return persistencePort.updateProduct(dtoModel);
    }

    @Override
    public List<ProductDto> getProducts() {
        return persistencePort.getProducts();
    }

    @Override
    public ProductDto getProductById(long id) {
        return persistencePort.getProductById(id);
    }
}
