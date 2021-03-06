package ThinkingInJava.Chapter7;
//Синтаксис наследования и его свойства
class Cleanser {
    private String s = "Cleanser";
    public  void append(String a){ s += a; }
    public void dilute() {append(" dilute()");}
    public  void apply() {append(" apply()");}
    public void scrub() {append(" scrub()");}
    public String toString() {return s;}

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();x.apply();x.scrub();
        System.out.println(x);
    }
}
public class Detergent extends Cleanser {
    //изменяем метод
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();//вызываем метод базового класса
    }
    //добавляем новые методы к интерфейсу
    public void foam(){append(" foam");}
    //проверяем новый класс
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Проверяем базовый класс");
        Cleanser.main(args);
        Deter.main(args);

    }
}
class Deter extends Detergent {
    public void scrub() {
        append(" Deter.scrub()");
        super.scrub();
    }
    private void sterelize(){
        append(" sterelize");
    }

    public static void main(String[] args) {
        Deter c = new Deter();
        c.scrub();//выводит всебазовые методы (Detergent и Cleanser)
        c.sterelize();
        System.out.println(c);
    }
}

