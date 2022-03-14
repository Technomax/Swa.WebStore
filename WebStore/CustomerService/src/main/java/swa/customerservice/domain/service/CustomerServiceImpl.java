package swa.customerservice.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swa.customerservice.domain.data.CustomerDto;
import swa.customerservice.domain.ports.api.CustomerServicePort;
import swa.customerservice.domain.ports.spi.CustomerPersistencePort;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerServicePort {

    @Autowired
    private CustomerPersistencePort persistencePort;

    @Override
    public CustomerDto addCustomer(CustomerDto dtoModel) {
        CustomerDto CustomerDTO=persistencePort.addCustomer(dtoModel);
        return CustomerDTO;
    }

    @Override
    public void deleteCustomerById(long id) {
        persistencePort.deleteCustomerById(id);
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto dtoModel) {
        return persistencePort.updateCustomer(dtoModel);
    }

    @Override
    public List<CustomerDto> getCustomers() {
        return persistencePort.getCustomers();
    }

    @Override
    public CustomerDto getCustomerById(long id) {
        return persistencePort.getCustomerById(id);
    }
}
