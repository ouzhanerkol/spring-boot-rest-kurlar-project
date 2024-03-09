package com.kurlar.example.service;

import com.kurlar.example.model.Banknote;
import com.kurlar.example.model.Cross;
import com.kurlar.example.model.Forex;
import com.kurlar.example.model.Information;
import com.kurlar.example.repository.BanknoteRepository;
import com.kurlar.example.repository.CrossRepository;
import com.kurlar.example.repository.ForexRepository;
import com.kurlar.example.repository.InformationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {
    private final ForexRepository forexRepository;
    private final BanknoteRepository banknoteRepository;
    private final CrossRepository crossRepository;
    private final InformationRepository informationRepository;

    public CurrencyService(ForexRepository forexRepository, BanknoteRepository banknoteRepository, CrossRepository crossRepository, InformationRepository informationRepository) {
        this.forexRepository = forexRepository;
        this.banknoteRepository = banknoteRepository;
        this.crossRepository = crossRepository;
        this.informationRepository = informationRepository;
    }

    public List<Forex> getAllForex(){
        return forexRepository.findAll();
    }

    public List<Banknote> getAllBanknote() {
        return banknoteRepository.findAll();
    }

    public List<Cross> getAllCross() {
        return crossRepository.findAll();
    }

    public List<Information> getAllInformation() {
        return informationRepository.findAll();
    }

    public List<Forex> getAllForexByCurrencyCode(String currencyCode) {
        return forexRepository.findAllByCurrencyCode(currencyCode);
    }

    public List<Banknote> getAllBanknoteByCurrencyCode(String currencyCode) {
        return banknoteRepository.findAllByCurrencyCode(currencyCode);
    }

    public List<Cross> getAllCrossByCurrencyCode(String currencyCode) {
        return crossRepository.findAllByCurrencyCode(currencyCode);
    }

    public List<Information> getAllInformationByCurrencyCode(String currencyCode) {
        return informationRepository.findAllByCurrencyCode(currencyCode);
    }
}
