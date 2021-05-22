package temaPhone;

public class SamsungGalaxy9Plus extends Samsung{
    final private int Imei;

    public SamsungGalaxy9Plus(int batteryLife, String color, String material, int Imei) {
        super(batteryLife, color, material);
        this.Imei = Imei;
    }
}
