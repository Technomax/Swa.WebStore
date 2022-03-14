package swa.customerservice.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import swa.customerservice.infrastructure.entity.Customer;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends MongoRepository<Customer, Long> {
//    @Query("{accountNumber : ?0}")
//    Optional<Customer> findByAccount(String accountNumber);
}
