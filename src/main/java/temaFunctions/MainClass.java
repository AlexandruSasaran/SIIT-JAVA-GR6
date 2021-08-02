package temaFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        SalesRepresentative seller1 = new SalesRepresentative("Andrei", 10, 500);
        SalesRepresentative seller2 = new SalesRepresentative("Alexandru", 7, 800);
/**
 * Cream o lista cu agentii de vanzari
 */
        List<SalesRepresentative> sellersList = new ArrayList<>();
        sellersList.add(seller1);
        sellersList.add(seller2);
        System.out.println("Agentii de vanzari sunt: " + sellersList);
/**
 * Sortam lista cu ajutorul comparatorului
 */
        Collections.sort(sellersList, new SellersRevenueComparator());
        System.out.println("Agentii de vanzari in ordinea descendenta a incasarilor sunt: " + sellersList);
/**
Fac un test pentru mai multi agenti. Am extras codul intr-o metoda.
 */
        testLista2(seller1, seller2);
    }
/**
 * Sortare utilizand algoritmul bubble sort
  */
        SalesRepresentative[] sortingSellerList = sortingSellerList();
        MainClass bubble = new MainClass();
        SalesRepresentative[] sortedList = bubble.sort(sortingSellerList);
        System.out.println(Arrays.toString(sortedList));
    }
/**
* Metoda bubble sort
 */

    public SalesRepresentative[] sort(SalesRepresentative[] sellersList){
        boolean sorted = true;
        while (sorted){
            sorted = false;
            for (int i = 0; i < sellersList.length - 1; i++){
                if (sellersList[i].getRevenue() < sellersList[i+1].getRevenue()) {
                    SalesRepresentative temp  = sellersList[i];
                    sellersList[i] = sellersList[i + 1];
                    sellersList[i + 1] = temp;
                    sorted = true;
                }
            }
        }
        return sellersList;
    }

    public static SalesRepresentative[] sortingSellerList() {
        SalesRepresentative seller1 = new SalesRepresentative("Andrei", 10, 500);
        SalesRepresentative seller2 = new SalesRepresentative("Alexandru", 7, 800);
        SalesRepresentative seller3 = new SalesRepresentative("Mircea", 10, 600);
        SalesRepresentative seller4 = new SalesRepresentative("Ionut", 1, 2500);
        SalesRepresentative seller5 = new SalesRepresentative("Paul", 13, 200);
        SalesRepresentative seller6 = new SalesRepresentative("Sergiu", 8, 1000);

        SalesRepresentative[] sellersList = new SalesRepresentative[]{seller1, seller2, seller3, seller4, seller5, seller6};
        return sellersList;
    }
    
    private static void testLista2(SalesRepresentative seller1, SalesRepresentative seller2) {
        SalesRepresentative seller3 = new SalesRepresentative("Mircea", 10, 600);
        SalesRepresentative seller4 = new SalesRepresentative("Ionut", 1, 2500);
        SalesRepresentative seller5 = new SalesRepresentative("Paul", 13, 200);
        SalesRepresentative seller6 = new SalesRepresentative("Sergiu", 8, 1000);

        List<SalesRepresentative> sellersList2 = new ArrayList<>();
        sellersList2.add(seller1);
        sellersList2.add(seller2);
        sellersList2.add(seller3);
        sellersList2.add(seller4);
        sellersList2.add(seller5);
        sellersList2.add(seller6);

        Collections.sort(sellersList2, new SellersRevenueComparator());
        System.out.println("Agentii de vanzari in ordinea descendenta a incasarilor sunt: ");
        sellersList2.forEach(System.out::println);
    }
}
