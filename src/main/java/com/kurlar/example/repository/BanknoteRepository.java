package com.kurlar.example.repository;

import com.kurlar.example.model.Banknote;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BanknoteRepository extends JpaRepository<Banknote,Integer> {
    List<Banknote> findAll();

    List<Banknote> findAllByCurrencyCode(String currencyCode);
}
