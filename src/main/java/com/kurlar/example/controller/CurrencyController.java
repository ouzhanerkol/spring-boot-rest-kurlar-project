package com.kurlar.example.controller;

import com.kurlar.example.model.*;
import com.kurlar.example.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CurrencyController {
    @Autowired
    private CurrencyService service;

    @GetMapping("/getType")
    public List<Currency> findAllType() {return service.getAllType();}

    @GetMapping("/getType/forex")
    public List<Forex> findForexByType() {
        return service.getAllForex();
    }

    @GetMapping("/getType/banknote")
    public List<Banknote> findBanknoteByType() {
        return service.getAllBanknote();
    }

    @GetMapping("/getType/cross")
    public List<Cross> findCrossByType() {
        return service.getAllCross();
    }

    @GetMapping("/getType/information")
    public List<Information> findInformationByType() {
        return service.getAllInformation();
    }

    @GetMapping("/getCurrencyCode/forex/{currencyCode}")
    public List<Forex> findAllForexByCurrencyCode(@PathVariable String currencyCode) {
        return service.getAllForexByCurrencyCode(currencyCode);
    }

    @GetMapping("/getCurrencyCode/banknote/{currencyCode}")
    public List<Banknote> findAllBanknoteByCurrencyCode(@PathVariable String currencyCode) {
        return service.getAllBanknoteByCurrencyCode(currencyCode);
    }

    @GetMapping("/getCurrencyCode/cross/{currencyCode}")
    public List<Cross> findAllCrossByCurrencyCode(@PathVariable String currencyCode) {
        return service.getAllCrossByCurrencyCode(currencyCode);
    }

    @GetMapping("/getCurrencyCode/information/{currencyCode}")
    public List<Information> findAllInformationByCurrencyCode(@PathVariable String currencyCode) {
        return service.getAllInformationByCurrencyCode(currencyCode);
    }
}
