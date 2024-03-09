package com.kurlar.example.repository;

import com.kurlar.example.model.Forex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ForexRepository extends JpaRepository<Forex,Integer> {


    List<Forex> findAll();


    List<Forex> findAllByCurrencyCode(@Param("currencyCode") String currencyCode);
}
