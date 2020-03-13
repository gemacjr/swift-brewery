package com.swiftbeard.swiftbrewery.services.v2;

import com.swiftbeard.swiftbrewery.web.model.BeerDto;
import com.swiftbeard.swiftbrewery.web.model.v2.BeerDtoV2;
import com.swiftbeard.swiftbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerByID(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Shiner Boch")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtov2) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtov2) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deletById(UUID beerId) {
        log.debug("Deleting a beer..");
    }
}
