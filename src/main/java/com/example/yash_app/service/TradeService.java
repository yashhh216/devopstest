package com.example.yash_app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yash_app.model.Trade;
import com.example.yash_app.repository.TradeRepository;

@Service
public class TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    public List<Trade> getOpenTrades() {
        return tradeRepository.findByStatus("open");
    }

    public List<Trade> getTradesMaturingInNext5Days() {
        LocalDate today = LocalDate.now();
        LocalDate fiveDaysLater = today.plusDays(5);
        return tradeRepository.findBySettlementDateBetween(today, fiveDaysLater);
    }
}