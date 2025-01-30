package com.example.yash_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.yash_app.model.Trade;
import com.example.yash_app.service.TradeService;

@RestController
@RequestMapping("/trades")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @GetMapping("/open")
    public List<Trade> getOpenTrades() {
        return tradeService.getOpenTrades();
    }

    @GetMapping("/maturing")
    public List<Trade> getTradesMaturingInNext5Days() {
        return tradeService.getTradesMaturingInNext5Days();
    }
}