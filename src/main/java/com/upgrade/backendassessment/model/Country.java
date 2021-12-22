package com.upgrade.backendassessment.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "COUNTRY")
public class Country {

    @Id
    private Integer id;

    private String name;
    private String capital;
    private int population;
    private String continent;

    @Column(name = "flag_as_image")
    private String flag;

    @Column(name = "language_id")
    private int language;
}