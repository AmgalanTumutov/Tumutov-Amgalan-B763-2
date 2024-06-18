/*
Тумутов Амгалан Б763-2
Вариант А
18. Столовые приборы. Возможности: просмотреть приборы определенного бренда;
изменить материал изготовления приборов;
произвести партиюприборов;
остановить производство приборов;
оформить договор на производство приборов;
оценить стоимость приборов; реставрировать приборы.
Добавить специализированные методы для Вилка, Нож, Палочка для еды.
*/

public class Main {
    public static void main(String[] args) {
        fork fork1 = new fork("Люкс", "Сталь");
        fork1.show_cutlery();
        fork1.change_material("Серебро");
        fork1.begin_production(5);
        fork1.end_production();
        fork1.draw_doc();
        fork1.estimate();
        fork1.restore();
    }
}
abstract class cutlery{
    protected String brand;
    protected String material;
    public cutlery(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }
    abstract void begin_production(int count);
    abstract void end_production();
    abstract void draw_doc();
    abstract double estimate();
    abstract void restore();
    public void show_cutlery(){
        System.out.println("Бренд: " + brand + ", Материал: " + material);
    }
    public void change_material(String new_material){
        material = new_material;
        System.out.println("Материал изменен на: " + material);
    }
}
class fork extends cutlery{
    public fork(String brand, String material) {
        super(brand, material);
    }
    @Override
    void begin_production(int count){
        System.out.println("Произведено: " + count + " вилок");
    }
    @Override
    void end_production(){
        System.out.println("Производство завершено");
    }
    @Override
    void draw_doc(){
        System.out.println("Договор на производство вилок оформлен.");
    }
    @Override
    double estimate(){
        double estimate = 54.0;
        System.out.println("Стоимость вилки: " + estimate);
        return estimate;
    }
    @Override
    void restore(){
        System.out.println("Вилка реставрирована.");
    }
}
class knife extends cutlery{
    public knife(String brand, String material) {
        super(brand, material);
    }
    @Override
    void begin_production(int count){
        System.out.println("Произведено: " + count + " ножей");
    }
    @Override
    void end_production(){
        System.out.println("Производство завершено");
    }
    @Override
    void draw_doc(){
        System.out.println("Договор на производство ножей оформлен.");
    }
    @Override
    double estimate(){
        double estimate = 105.5;
        System.out.println("Стоимость ножа: " + estimate);
        return estimate;
    }
    @Override
    void restore(){
        System.out.println("Нож реставрирован.");
    }
}
class food_sticks extends cutlery{
    public food_sticks(String brand, String material) {
        super(brand, material);
    }
    @Override
    void begin_production(int count){
        System.out.println("Произведено: " + count + " ножей");
    }
    @Override
    void end_production(){
        System.out.println("Производство завершено");
    }
    @Override
    void draw_doc(){
        System.out.println("Договор на производство палочек оформлен.");
    }
    @Override
    double estimate(){
        double estimate = 213.5;
        System.out.println("Стоимость палочки для еды: " + estimate);
        return estimate;
    }
    @Override
    void restore(){
        System.out.println("Палочка для еды реставрирована.");
    }
}




