package com.swiftbeard.swiftbrewery.services;

import com.swiftbeard.swiftbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Slf4j
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

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deletById(UUID beerId) {
        log.debug("Deleting a beer..");
    }
}
