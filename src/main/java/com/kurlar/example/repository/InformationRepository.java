package com.kurlar.example.repository;

import com.kurlar.example.model.Banknote;
import com.kurlar.example.model.Information;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InformationRepository extends JpaRepository<Information,Integer> {
    List<Information> findAll();

    List<Information> findAllByCurrencyCode(String currencyCode);
}
