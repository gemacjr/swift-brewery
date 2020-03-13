package com.swiftbeard.swiftbrewery.web.controller.v2;


import com.swiftbeard.swiftbrewery.services.BeerService;
import com.swiftbeard.swiftbrewery.services.v2.BeerServiceV2;
import com.swiftbeard.swiftbrewery.web.model.BeerDto;
import com.swiftbeard.swiftbrewery.web.model.v2.BeerDtoV2;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerServicev2;

    public BeerControllerV2(BeerServiceV2 beerServicev2){
        this.beerServicev2 = beerServicev2;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerServicev2.getBeerByID(beerId), HttpStatus.OK);
    }

    @PostMapping // CREATE a new beer
    public ResponseEntity handlePost(@RequestBody BeerDtoV2 beerDto){
        BeerDtoV2 savedDto = beerServicev2.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();

        //todo add hostname to url
        headers.add("Location", "/api/v2/beer/" + savedDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDtoV2 beerDto) {
        beerServicev2.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerServicev2.deletById(beerId);

    }
}
