package com.kurlar.example.repository;

import com.kurlar.example.model.Banknote;
import com.kurlar.example.model.Cross;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrossRepository extends JpaRepository<Cross,Integer> {
    List<Cross> findAll();

    List<Cross> findAllByCurrencyCode(String currencyCode);
}
