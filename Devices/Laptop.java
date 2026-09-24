package adapterpattern;

// ===================== Adaptee =====================
// Has its own interface, incompatible with PowerOutlet.
public class Laptop {
    public void charge() {
        System.out.println("Laptop is charging via its power brick.");
    }
}