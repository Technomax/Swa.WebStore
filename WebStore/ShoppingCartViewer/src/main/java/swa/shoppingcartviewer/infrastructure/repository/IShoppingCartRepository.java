package swa.shoppingcartviewer.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import swa.shoppingcartviewer.infrastructure.entity.ShoppingCart;

@Repository
public interface IShoppingCartRepository extends MongoRepository<ShoppingCart, Long> {
//    @Query("{accountNumber : ?0}")
//    Optional<Customer> findByAccount(String accountNumber);
}
