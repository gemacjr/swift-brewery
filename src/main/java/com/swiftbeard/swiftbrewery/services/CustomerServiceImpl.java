package com.swiftbeard.swiftbrewery.services;

import com.swiftbeard.swiftbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .name("Ed McCormic")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
       return CustomerDto.builder()
               .customerId(UUID.randomUUID())
               .name("Georgia Macky")
               .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting a customer..");
    }
}
