package com.upgrade.backendassessment.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Continent {
    private String name;
    private List<Country> countries;
}
