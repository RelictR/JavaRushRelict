package JavaRush.JavaSyntax.task08;
/*Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5. Метод removeAllNumbersMoreThan10() должен удалять из множества все числа больше 10.
*/

import java.util.HashSet;
import java.util.Random;

public class Solution0814 {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        Random rand = new Random();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++){
            set.add(rand.nextInt(20));
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        set.removeIf(element -> element > 10);
        return set;
        /*for (Iterator<Integer> i = set.iterator();i.hasNext();){
            Integer element = i.next();
            if (element > 10){
                i.remove(); //можно и так
            }
        }*/
    }

    public static void main(String[] args) {
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}