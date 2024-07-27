package app;

public class Main {
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {
        calcAndPrintSalesInfo("smartphone", 607.67, 20, 5, 1);
        calcAndPrintSalesInfo("laptop", 749.06, 14, 7, 2);
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
