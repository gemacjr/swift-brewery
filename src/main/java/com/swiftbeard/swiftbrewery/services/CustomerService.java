package com.swiftbeard.swiftbrewery.services;

import com.swiftbeard.swiftbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
