package ThinkingInJava.Chapter11;

import java.util.ArrayList;

//простой пример использования контейнера (с предупреждением компилятора).
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id(){return id;}
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("uchecked")
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
            //apples.add(new Orange()); - ошибка во время компиляции
        }
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
            //Обьект Orange обнаруживается только во время выполнения
        }
        for (Apple c : apples){
            System.out.println(c.id());
        }
    }
}
