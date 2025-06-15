package com.electradrive.ElectraDrive.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle
{
    @Id
    @GeneratedValue
    private Integer id;

    private String model_name;
    private String model_version;
    private int model_year;
    private int speed;
}
