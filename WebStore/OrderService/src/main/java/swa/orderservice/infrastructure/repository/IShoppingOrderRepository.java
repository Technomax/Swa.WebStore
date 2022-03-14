package swa.orderservice.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import swa.orderservice.infrastructure.entity.ShoppingOrder;

@Repository
public interface IShoppingOrderRepository extends MongoRepository<ShoppingOrder, Long> {
//    @Query("{accountNumber : ?0}")
//    Optional<Customer> findByAccount(String accountNumber);
}
