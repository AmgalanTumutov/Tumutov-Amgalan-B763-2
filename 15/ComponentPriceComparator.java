import java.util.Comparator;

public class ComponentPriceComparator implements Comparator<Component> {
    @Override
    public int compare(Component c1, Component c2) {
        return c1.getPrice() - c2.getPrice();
    }
}
