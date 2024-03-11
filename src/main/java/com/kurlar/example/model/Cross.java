package com.kurlar.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "crossrates")
public class Cross extends Currency{
    @Id
    private int id;
    @Column(name = "crossRate")
    private double crossRate;
}
