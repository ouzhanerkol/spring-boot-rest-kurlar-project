package com.kurlar.example.service;

import com.kurlar.example.model.*;
import com.kurlar.example.repository.*;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
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

    public List<Currency> getAllType() {
        List<Currency> currencyList = new ArrayList<>();
        currencyList.addAll(forexRepository.findAll());
        currencyList.addAll(banknoteRepository.findAll());
        currencyList.addAll(crossRepository.findAll());
        currencyList.addAll(informationRepository.findAll());
        return currencyList;
    }
}
