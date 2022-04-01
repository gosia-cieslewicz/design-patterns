package com.behavioral.observer;

public class Demo {

    public static void main(String[] args) {
        // write your code here
        var stock = new Stock("stock1", 111);

        var statusBar = new StatusBar();
        var stockList = new StockListView();

        stock.addObserver(statusBar);
        stock.addObserver(stockList);

        statusBar.addStock(stock);
        stockList.addStock(stock);

        stock.setPrice(222);
    }
}
