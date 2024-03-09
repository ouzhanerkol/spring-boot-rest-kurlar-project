package com.kurlar.example.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "banknote")
public class Banknote{
    @Id
    private int id;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "currencyCode")
    private String currencyCode;
    @Column(name = "unit")
    private int unit;
    @Column(name = "banknoteBuying")
    private double banknoteBuying;
    @Column(name = "banknoteSelling")
    private double banknoteSelling;
}
