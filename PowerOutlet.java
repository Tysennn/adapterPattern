package adapterpattern;
 
// ===================== Target =====================
// The common interface every device must present to the power outlet.
public interface PowerOutlet {
    void plugIn();
}