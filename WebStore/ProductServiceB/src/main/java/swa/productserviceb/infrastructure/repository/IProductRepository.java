package swa.productserviceb.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import swa.productserviceb.infrastructure.entity.Product;

@Repository
public interface IProductRepository extends MongoRepository<Product, Long> {
//    @Query("{accountNumber : ?0}")
//    Optional<Customer> findByAccount(String accountNumber);
}
