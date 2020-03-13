package com.swiftbeard.swiftbrewery.services;

import com.swiftbeard.swiftbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerByID(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Shiner Boch")
                .beerStyle("Bock")
                .build();
    }
}
