package JavaRush.JavaSyntax.task08;
import java.util.Set;
import java.util.HashSet;
/*
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только два метода.
4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

public class Solution0813 {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        set.add("Лиса");
        set.add("Лоза");
        set.add("Люк");
        set.add("Лиза");
        set.add("Лось");
        set.add("Лик");
        set.add("Лук");
        set.add("Лом");
        set.add("Лира");
        set.add("Лямка");
        set.add("Лаз");
        set.add("Лопух");
        set.add("Локоть");
        set.add("Лениград");
        set.add("Ломоть");
        set.add("Лагерь");
        set.add("Левый");
        set.add("Луг");
        set.add("Линза");
        set.add("Лежак");
            return set;
    }

    public static void main(String[] args) {

    }
}
