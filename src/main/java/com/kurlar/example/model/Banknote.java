package com.kurlar.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "banknote")
public class Banknote extends Currency{
    @Id
    private int id;
    @Column(name = "banknoteBuying")
    private double banknoteBuying;
    @Column(name = "banknoteSelling")
    private double banknoteSelling;
}
