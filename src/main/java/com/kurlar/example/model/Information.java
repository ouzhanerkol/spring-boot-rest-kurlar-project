package com.kurlar.example.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "information")
public class Information{

    @Id
    private int id;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "currencyCode")
    private String currencyCode;
    @Column(name = "unit")
    private int unit;
    @Column(name = "informationUSD")
    private double informationUSD;

    @Column(name = "informationTRY")
    private double informationTRY;

}
