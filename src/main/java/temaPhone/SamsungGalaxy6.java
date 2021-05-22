package temaPhone;

public class SamsungGalaxy6 extends Samsung {
    final private int Imei;

    public SamsungGalaxy6(int batteryLife, String color, String material, int Imei) {
        super(batteryLife, color, material);
        this.Imei = Imei;
    }
}
