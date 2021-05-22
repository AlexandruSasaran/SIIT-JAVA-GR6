package temaFunctions;

import java.util.Comparator;

/**
 * Creeam o clasa pentru compararea veniturilor;
 * Implementam(override) metoda din clasa Comparator.
 */
public class SellersRevenueComparator implements Comparator<SalesRepresentative> {

    @Override
    public int compare(SalesRepresentative o1, SalesRepresentative o2) {
        return o2.getRevenue() - o1.getRevenue();
    }
}
