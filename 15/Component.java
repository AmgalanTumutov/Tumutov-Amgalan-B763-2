public class Component {
    private String name;
    private String origin;
    private int price;
    private boolean isPeripheral;
    private int powerConsumption;
    private boolean hasCooler;
    private String group;
    private String ports;
    private boolean isCritical;

    public Component(String name, String origin, int price, boolean isPeripheral, int powerConsumption, boolean hasCooler, String group, String ports, boolean isCritical) {
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.isPeripheral = isPeripheral;
        this.powerConsumption = powerConsumption;
        this.hasCooler = hasCooler;
        this.group = group;
        this.ports = ports;
        this.isCritical = isCritical;
    }
    public String getName() {
        return name;
    }
    public String getOrigin() {
        return origin;
    }
    public int getPrice() {
        return price;
    }
    public boolean isPeripheral() {
        return isPeripheral;
    }
    public int getPowerConsumption() {
        return powerConsumption;
    }
    public boolean hasCooler() {
        return hasCooler;
    }
    public String getGroup() {
        return group;
    }
    public String getPorts() {
        return ports;
    }
    public boolean isCritical() {
        return isCritical;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setPeripheral(boolean peripheral) {
        isPeripheral = peripheral;
    }
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
    public void setHasCooler(boolean hasCooler) {
        this.hasCooler = hasCooler;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setPorts(String ports) {
        this.ports = ports;
    }
    public void setCritical(boolean critical) {
        isCritical = critical;
    }
}
