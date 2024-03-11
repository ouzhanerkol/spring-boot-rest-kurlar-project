package com.kurlar.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "forex")
public class Forex extends Currency{
    @Id
    private int id;
    @Column(name = "forexBuying")
    private double forexBuying;
    @Column(name = "forexSelling")
    private double forexSelling;
}
