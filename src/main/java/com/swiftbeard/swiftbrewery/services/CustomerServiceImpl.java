package com.swiftbeard.swiftbrewery.services;

import com.swiftbeard.swiftbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .name("Ed McCormic")
                .build();
    }
}