package recap;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.85, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.10, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.10, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.10, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket tim = new Basket("tim");

        sellItem(tim, "car", 1);
        System.out.println(tim);

        sellItem(tim, "car", 1);
        System.out.println(tim);

        sellItem(tim, "car", 1);

        sellItem(tim, "spanner", 1);
//        System.out.println(tim);

        sellItem(tim, "juice", 4);
        sellItem(tim, "cup", 12);
        sellItem(tim, "bread", 1);
//        System.out.println(tim);

//        System.out.println(stockList);

        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);

        System.out.println(basket);

        removeItem(tim, "car", 2);
        removeItem(tim, "cup", 9);
        System.out.println("cars removed: " + removeItem(tim, "car", 1)); // 0

        System.out.println(tim);

        //removing all items
        removeItem(tim, "bread", 1);
        removeItem(tim, "juice", 4);
        removeItem(tim, "cup", 3);
        System.out.println("cup removed: " + removeItem(tim, "cup", 3)); // 0

        System.out.println(tim);

        System.out.println("\nStockList before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);


//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);

        StockItem car = stockList.get("car");
        if (car != null) {
            car.adjustStock(100);
            stockList.Items().get("car").adjustStock(2000);
            stockList.get("car").adjustStock(-1000);
        }
        System.out.println(stockList);

//        System.out.println();
//        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkOut(tim);
        System.out.println(tim);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (stockList.get(item).availableStock() == 0) {
            System.out.println("We don't have any more " + item + "s");
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }


    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (stockList.get(item).availableStock() == 0) {
            System.out.println("We don't have any more " + item + "s");
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {

            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
//            sellItem(basket, item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
