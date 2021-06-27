package JUnit;

public class Calculator {
    public Calculator(){
    }

    public static boolean unitateMasura(String item){
        return item.contains("mm") || item.contains("cm") || item.contains("mdm") || item.contains("m") || item.contains("km");
    }

    public static double calculareUnitateMasura(String expression){
        String[] items = expression.split("\\s+");

        boolean pozitiv = true;
        boolean negativ = false;
        double rezultat = 0;

        for (int i = 0; i < items.length; i++){
            if (items[i].contains("-")){
                pozitiv = false;
                negativ = true;
            } else if (items[i].contains("+")){
                pozitiv = true;
                negativ = false;
            }
            if (unitateMasura(items[i])) {
                if (pozitiv) {
                    rezultat = rezultat + convertireUnitateMasura(Double.parseDouble(items[i - 1]), items[i]);
                } else if (negativ) {
                    rezultat = rezultat - convertireUnitateMasura(Double.parseDouble(items[i - 1]), items[i]);
                }
            }
        }
        System.out.println("Rezultatul convertirii este: ");
        return rezultat;
    }

    public static double convertireUnitateMasura(double unitate, String unitateMasura) {
        double rezultat = 0;
        switch (unitateMasura){
            case "mm":
                rezultat = unitate;
                break;
            case "cm":
                rezultat = unitate * 10;
                break;
            case "dm":
                rezultat = unitate * 100;
                break;
            case "m":
                rezultat = unitate * 1000;
                break;
            case "km":
                rezultat = unitate * 1000000;
                break;
            default:
                System.out.println("Unitate de masura invalida");
                break;
        }
        return rezultat;
    }
}
