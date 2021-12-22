package com.upgrade.backendassessment.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Languages {
    @Id
    private Integer id;

    private String name;
}
