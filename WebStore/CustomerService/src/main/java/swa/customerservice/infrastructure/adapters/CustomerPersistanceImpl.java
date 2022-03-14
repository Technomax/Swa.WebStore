package swa.customerservice.infrastructure.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import swa.customerservice.domain.data.CustomerDto;
import swa.customerservice.domain.ports.spi.CustomerPersistencePort;
import swa.customerservice.infrastructure.entity.Customer;
import swa.customerservice.infrastructure.mappers.CustomerMapperImpl;
import swa.customerservice.infrastructure.repository.ICustomerRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerPersistanceImpl implements CustomerPersistencePort {
    @Autowired
    private ICustomerRepository repository;

    @Override
    public CustomerDto addCustomer(CustomerDto dtoModel) {
        CustomerMapperImpl CustomerMapper = new CustomerMapperImpl();
        Customer Customer = CustomerMapper.CustomerDtoToCustomer(dtoModel);
        Customer CustomerSaved = repository.save(Customer);
        return CustomerMapper.CustomerToCustomerDto(CustomerSaved);
    }



    @Override
    public void deleteCustomerById(long id) {
        Optional<Customer> Customer=repository.findById(id);
        repository.deleteById(Customer.get().getId());
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto CustomerDto) {

        return addCustomer(CustomerDto);
    }

    @Override
    public List<CustomerDto> getCustomers() {
        List<Customer> CustomerList = repository.findAll();
        CustomerMapperImpl CustomerMapper = new CustomerMapperImpl();
        List<CustomerDto> CustomerDtoList = CustomerMapper.CustomerListToCustomerDtoList(CustomerList);
        return CustomerDtoList;
    }

    @Override
    public CustomerDto getCustomerById(long id) {
        CustomerMapperImpl CustomerMapper = new CustomerMapperImpl();
        Optional<Customer> Customer = repository.findById(id);
        if (Customer.isPresent()) {
            return CustomerMapper.CustomerToCustomerDto(Customer.get());
        }
        return null;
    }
}
