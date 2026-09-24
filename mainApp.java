package adapterpattern;

public class Main {
    public static void main(String[] args) {
        PowerStrip strip = new PowerStrip();
 
        PowerOutlet laptopOutlet = new LaptopAdapter(new Laptop());
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(new Refrigerator());
        PowerOutlet phoneOutlet = new SmartphoneAdapter(new SmartphoneCharger());
 
        strip.plugInDevice(laptopOutlet);
        strip.plugInDevice(fridgeOutlet);
        strip.plugInDevice(phoneOutlet);
    }
}