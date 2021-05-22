package temaFunctions;

public class SalesRepresentative {
/**
* se adauga atributele specifice clasei SalesRepresentative
*/
    private String name;
    private int numberOfSales;
    private int quotaPerSale;
    private int revenue;
/**
* realizem constructorul clasei SalesRepresentative
*/
    public SalesRepresentative(String name, int numberOfSales, int quotaPerSale) {
        this.name = name;
        this.numberOfSales = numberOfSales;
        this.quotaPerSale = quotaPerSale;
        this.revenue = numberOfSales * quotaPerSale;
    }
/**
* generam getter pentru Revenue
*/
    public int getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "name='" + name + '\'' +
                ", numberOfSales=" + numberOfSales +
                ", quotaPerSale=" + quotaPerSale +
                ", revenue=" + revenue +
                '}';
    }
}


