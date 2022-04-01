package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    public void priceChanged() {
        System.out.println("Refresh StockListView");
        show();
    }
}
