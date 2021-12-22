package com.upgrade.backendassessment.service;

import com.upgrade.backendassessment.model.Country;
import com.upgrade.backendassessment.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Optional<Country> getCountryById(Integer id) {
        return countryRepository.findById(id);
    }

    public Country saveCountry(Country countryRequest) {
        return countryRepository.save(countryRequest);
    }

    public Country updateCountry(Integer countryId, Country countryRequest) {
        return countryRepository.save(countryRequest);
    }

    public void deleteCountryById(Integer id) {
        countryRepository.deleteById(id);
    }

    public byte[] downloadImage() {
        try (BufferedInputStream in = new BufferedInputStream(new URL("https://www.technicalkeeda.com/img/images/article/spring-file-upload-eclipse-setup.png").openStream()) ) {

            return in.readAllBytes();
        } catch (IOException e) {
            // handle exception
            return null;
        }
    }
}
