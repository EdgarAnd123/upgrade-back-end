package com.upgrade.backendassessment.repository;

import com.upgrade.backendassessment.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    List<Country> findAll();

    Optional<Country> findById(Integer id);
}
