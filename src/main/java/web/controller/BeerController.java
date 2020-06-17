package web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.model.BeerDto;

import java.util.UUID;

/**
 * Created by Shehaz on 17-Jun-20.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId)
    {
        //todo Impl
        return new ResponseEntity<BeerDto>(BeerDto.builder().build(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto)
    {
        //todo Impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerByid(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto)
    {
        //todo Impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
