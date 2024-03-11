package com.kurlar.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "information")
public class Information extends Currency{
    @Id
    private int id;
    @Column(name = "informationUSD")
    private double informationUSD;
    @Column(name = "informationTRY")
    private double informationTRY;
}
