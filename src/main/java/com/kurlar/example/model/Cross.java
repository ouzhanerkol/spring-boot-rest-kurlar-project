package com.kurlar.example.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "crossrates")
public class Cross{
    @Id
    private int id;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "currencyCode")
    private String currencyCode;
    @Column(name = "unit")
    private int unit;
    @Column(name = "crossRate")
    private double crossRate;
}
