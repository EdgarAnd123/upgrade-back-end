package com.upgrade.backendassessment.controller;

import com.upgrade.backendassessment.controller.exceptions.EntityNotFoundException;
import com.upgrade.backendassessment.model.Continent;
import com.upgrade.backendassessment.model.Country;
import com.upgrade.backendassessment.service.ContinentService;
import com.upgrade.backendassessment.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private ContinentService continentService;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/country/{countryId}")
    public Country getCountryById(@PathVariable Integer countryId) {
        return countryService.getCountryById(countryId).orElseThrow(EntityNotFoundException::new);
    }

    @PostMapping(value = "/saveCountry",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Country saveNewCountry( @RequestBody Country countryRequest) {
        return countryService.saveCountry(countryRequest);
    }

    @PutMapping(value = "/updateCountry/{countryId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Country updateCountry(@PathVariable Integer countryId, @RequestBody Country countryRequest) {
        return countryService.updateCountry(countryId, countryRequest);
    }

    @DeleteMapping("/country/{countryId}")
    public String deleteCountrybyId(@PathVariable Integer countryId) {

        countryService.deleteCountryById(countryId);

        return "Country has been deleted successfully";
    }

    @GetMapping("/downloadImage")
    public ResponseEntity<byte []> downloadImageByUrl() {

        byte[] fileInBytes = countryService.downloadImage();

        return ResponseEntity.ok()
                .contentLength(fileInBytes.length)
                .contentType(MediaType.IMAGE_PNG)
                .body(fileInBytes);
    }

    @GetMapping("/continent/{continentName}")
    public Continent getContinentByName(@PathVariable String continentName) {
        return continentService.getContinentByName(continentName);
    }

}
