package app;

public class Main {
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {
        // phone info
        String phoneName = "smartphone";
        double phonePrice = 607.67;
        int phoneSalesCount = 20;
        int phoneSalesDays = 5;

        //laptop info
        String laptopName = "laptop";
        double laptopPrice = 749.06;
        int laptopSalesCount = 14;
        int laptopSalesDays = 7;

        calcAndPrintSalesInfo(phoneName, phonePrice, phoneSalesCount, phoneSalesDays, 1);
        calcAndPrintSalesInfo(laptopName, laptopPrice, laptopSalesCount, laptopSalesDays, 2);
    }

    public static void calcAndPrintSalesInfo(
        String productName,
        double productPrice,
        int productSalesCount,
        int productSalesDays,
        int productNumber
    ) {
        double totalProductSales = productSalesCount * productPrice;
        double averageSalesPerDay = totalProductSales / productSalesDays;

        System.out.printf(
            "Product No %d: %s,%ntotal sales for %d days is %s %.2f,%nsales by day is %s %.2f.%n%n",
            productNumber, productName, productSalesDays, CURRENCY, totalProductSales, CURRENCY, averageSalesPerDay
        );
    }
}
