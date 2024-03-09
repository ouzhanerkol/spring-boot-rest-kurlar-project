package com.kurlar.example.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "forex")
public class Forex{
    @Id
    private int id;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "currencyCode")
    private String currencyCode;
    @Column(name = "forexBuying")
    private double forexBuying;
    @Column(name = "forexSelling")
    private double forexSelling;
    @Column(name = "unit")
    private int unit;
}
