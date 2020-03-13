package com.swiftbeard.swiftbrewery.services;

import com.swiftbeard.swiftbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerByID(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deletById(UUID beerId);
}
