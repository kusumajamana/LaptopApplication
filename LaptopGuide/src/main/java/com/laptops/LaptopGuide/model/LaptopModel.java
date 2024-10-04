package com.laptops.LaptopGuide.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class LaptopModel {
    @Id
    private long serialNo;
    private long price;
    private String company;
    private float rating;
    private int ram;

}
