/*
Тумутов Амгалан Б763-2
5. Компьютеры.
Компьютерные комплектующие имеют следующие характеристики:
— Name — название комплектующего;
— Origin — страна производства;
— Price — цена (0‒n рублей);
— Type (должно быть несколько) — периферийное либо нет, энергопотребление (ватт), наличие кулера (есть либо нет), группа комплектующих
(устройства ввода-вывода, мультимедийные), порты (COM, USB, LPT);
— Critical — критично ли наличие комплектующего для работы компьютера.
Корневой элемент назвать Device.
С помощью XSL преобразовать XML-файл в формат XML, при выводе
корневым элементом сделать Critical.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLParser {
    public static void main(String[] args) {
        List<Component> componentsList = new ArrayList<>();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("components.xml");

            NodeList componentNodes = document.getElementsByTagName("Component");

            for (int i = 0; i < componentNodes.getLength(); i++) {
                Element componentElement = (Element) componentNodes.item(i);

                String name = componentElement.getElementsByTagName("Name").item(0).getTextContent();
                String origin = componentElement.getElementsByTagName("Origin").item(0).getTextContent();
                int price = Integer.parseInt(componentElement.getElementsByTagName("Price").item(0).getTextContent());
                boolean isPeripheral = Boolean.parseBoolean(componentElement.getElementsByTagName("Peripheral").item(0).getTextContent());
                int powerConsumption = Integer.parseInt(componentElement.getElementsByTagName("PowerConsumption").item(0).getTextContent());
                boolean hasCooler = Boolean.parseBoolean(componentElement.getElementsByTagName("Cooler").item(0).getTextContent());
                String group = componentElement.getElementsByTagName("Group").item(0).getTextContent();
                String ports = componentElement.getElementsByTagName("Ports").item(0).getTextContent();
                boolean isCritical = Boolean.parseBoolean(componentElement.getElementsByTagName("Critical").item(0).getTextContent());

                Component component = new Component(name, origin, price, isPeripheral, powerConsumption, hasCooler, group, ports, isCritical);

                componentsList.add(component);
            }

// Вывод информации о компонентах
            for (Component component : componentsList) {
                System.out.println("Имя: " + component.getName());
                System.out.println("Цена: " + component.getPrice());
                System.out.println("Страна производитель: " + component.getOrigin());
                System.out.println("Critical: " + component.isCritical());
                System.out.println("===================");
            }

// Сортировка компонентов по цене
            Collections.sort(componentsList, new ComponentPriceComparator());
            System.out.println("Компоненты отсортированные по цене:");
            for (Component component : componentsList) {
                System.out.println(component.getName() + " - " + component.getPrice());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
