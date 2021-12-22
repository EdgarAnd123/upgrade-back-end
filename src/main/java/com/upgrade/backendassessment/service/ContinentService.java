package com.upgrade.backendassessment.service;

import com.upgrade.backendassessment.model.Continent;
import com.upgrade.backendassessment.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ContinentService {

    @Autowired
    CountryService countryService;

    public Continent getContinentByName(String name) {
        return Continent.builder()
                .name(name)
                .countries(countryService.getAllCountries())
                .build();
    }
}
