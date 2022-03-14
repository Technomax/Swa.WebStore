package swa.customerservice.infrastructure.mappers;

import org.modelmapper.ModelMapper;
import swa.customerservice.domain.data.CustomerDto;
import swa.customerservice.infrastructure.entity.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto CustomerToCustomerDto(Customer Customer) {
        ModelMapper mapper = new ModelMapper();
        CustomerDto dto = mapper.map(Customer, CustomerDto.class);
        return dto;
    }

    @Override
    public Customer CustomerDtoToCustomer(CustomerDto CustomerDto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(CustomerDto, Customer.class);
    }

    @Override
    public List<CustomerDto> CustomerListToCustomerDtoList(List<Customer> CustomerList) {
        return CustomerList.stream().map(Customer -> CustomerToCustomerDto(Customer)).collect(Collectors.toList());
    }

    @Override
    public List<Customer> CustomerDtoListToCustomerList(List<CustomerDto> CustomerDtoList) {
        return CustomerDtoList.stream().map(CustomerDto -> CustomerDtoToCustomer(CustomerDto)).collect(Collectors.toList());
    }
}
