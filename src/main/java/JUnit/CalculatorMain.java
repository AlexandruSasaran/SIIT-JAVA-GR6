package JUnit;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter metric distance value(example: 10 cm + 1 m - 10 mm): ");
        double rezultat = calculator.calculareUnitateMasura(sc.nextLine());
        System.out.println(rezultat + "mm");
    }

}

