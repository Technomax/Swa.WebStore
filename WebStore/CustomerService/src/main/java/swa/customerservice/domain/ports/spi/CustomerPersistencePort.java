package swa.customerservice.domain.ports.spi;

import swa.customerservice.domain.data.CustomerDto;

import java.util.List;

public interface CustomerPersistencePort {
    CustomerDto addCustomer(CustomerDto dtoModel);

    void deleteCustomerById(long id);

    CustomerDto updateCustomer(CustomerDto dtoModel);

    List<CustomerDto> getCustomers();

    CustomerDto getCustomerById(long id);
}
