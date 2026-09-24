package adapterPattern;
 
 
// ===================== Client =====================
public class PowerStrip {
    // The client only ever talks to PowerOutlet — it doesn't know
    // or care what's actually plugged in behind each adapter.
    public void plugInDevice(PowerOutlet device) {
        device.plugIn();
    }
}