package swa.customerservice.infrastructure.mappers;

import swa.customerservice.domain.data.CustomerDto;
import swa.customerservice.infrastructure.entity.Customer;

import java.util.List;

public interface CustomerMapper {
    CustomerDto CustomerToCustomerDto(Customer Customer);

    Customer CustomerDtoToCustomer(CustomerDto CustomerDto);

    List<CustomerDto> CustomerListToCustomerDtoList(List<Customer> CustomerList);

    List<Customer> CustomerDtoListToCustomerList(List<CustomerDto> CustomerDtoList);
}
