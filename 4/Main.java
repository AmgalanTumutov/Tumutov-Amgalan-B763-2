/*
Тумутов Амгалан Б763-2
Вариант А
18. Создать объект класса Пианино, используя классы Клавиша, Педаль.
Методы: настроить, играть на пианино, нажимать клавишу.
*/

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        piano piano = new piano();
        piano.tune();
        piano.play();
    }
}
class key {
    private String note;
    public key(String note) {
        this.note = note;
    }
    public void setNote() {
        System.out.println("Играет нота: " + note);
    }
}
class pedal {
    private String type;
    public pedal(String type) {
        this.type = type;
    }
    public void setType() {
        System.out.println("Используется педаль: " + type);
    }
}
class piano {
    private key[] keys;
    private pedal[] pedals;
    public piano() {
        keys = new key[3];
        pedals = new pedal[3];
        keys[0] = new key("до");
        keys[1] = new key("ре");
        keys[2] = new key("ми");
        pedals[0] = new pedal("Сцепление");
        pedals[1] = new pedal("Газ");
        pedals[2] = new pedal("Тормоз");
    }
    public void tune() {
        System.out.println("Пианино настроено");
    }
    public void play() {
        System.out.println("Игра на пианино началась.");
        keys[0].setNote();
        pedals[0].setType();
        keys[1].setNote();
        pedals[1].setType();
    }
}


