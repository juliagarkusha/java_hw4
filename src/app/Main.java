package app;

public class Main {
    static String productName;
    static double productPrice;
    static int productSalesCount;
    static int productSalesDays;
    static int productNumber;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {
        productName = "smartphone";
        productPrice = 607.67;
        productSalesCount = 20;
        productSalesDays = 5;
        productNumber = 1;

        calcAndPrintSalesInfo(productName, productPrice, productSalesCount, productSalesDays, productNumber);

        productName = "laptop";
        productPrice = 749.06;
        productSalesCount = 14;
        productSalesDays = 7;
        productNumber = 2;
        calcAndPrintSalesInfo(productName, productPrice, productSalesCount, productSalesDays, productNumber);
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
