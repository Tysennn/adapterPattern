package adapterpattern;

// ===================== Adapter =====================
// Wraps a Laptop and exposes it through PowerOutlet.
public class LaptopAdapter implements PowerOutlet {
    private final Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void plugIn() {
        // Translate the generic plugIn() call into the laptop-specific charge()
        laptop.charge();
    }
}