package com.udemy.learningjavawithtimbuchalka;

import java.util.Map;

public class Main {
    private static StockList stocklist = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stocklist.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stocklist.addStock(temp);
        temp = new StockItem("car", 12.50, 2);
        stocklist.addStock(temp);
        temp = new StockItem("chair", 62.0, 10);
        stocklist.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stocklist.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stocklist.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stocklist.addStock(temp);
        temp = new StockItem("juice", 2.50, 36);
        stocklist.addStock(temp);
        temp = new StockItem("phone", 96.99, 35);
        stocklist.addStock(temp);
        temp = new StockItem("towel", 2.40, 80);
        stocklist.addStock(temp);
        temp = new StockItem("vase", 8.76, 40);
        stocklist.addStock(temp);

        System.out.println(stocklist);

        for (String s : stocklist.Items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("tim");
        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        if (sellItem(timsBasket, "car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }
        sellItem(timsBasket, "spanner", 5);
//        System.out.println(timsBasket);

        sellItem(timsBasket, "juice", 4);
        sellItem(timsBasket, "cup", 12);
        sellItem(timsBasket, "bread", 1);
//        System.out.println(timsBasket);
//        System.out.println(stocklist);

        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(timsBasket, "car", 2);
        removeItem(timsBasket, "cup", 9);
        System.out.println("cars removed: " + removeItem(timsBasket, "car", 1)); // should not remove

        System.out.println(timsBasket);

        //remove all items from timsBasket
        removeItem(timsBasket, "bread", 1);
        removeItem(timsBasket, "cup", 3);
        removeItem(timsBasket, "juice", 4);
        removeItem(timsBasket, "cup", 3);
        System.out.println(timsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stocklist);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stocklist);

//        temp = new StockItem("pen", 1.12);
//        stocklist.Items().put(temp.getName(), temp);

        stocklist.Items().get("car").adjustStock(2000);
        stocklist.get("car").adjustStock(-1000);
        System.out.println(stocklist);

//        for(Map.Entry<String, Double> price: stocklist.PriceList().entrySet()){
//            System.out.println(price.getKey() + " costs " + price);
//        }

        checkOut(timsBasket);
        System.out.println(timsBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stocklist.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stocklist.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stocklist.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stocklist.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stocklist.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
