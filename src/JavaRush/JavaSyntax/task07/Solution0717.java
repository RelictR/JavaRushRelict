package JavaRush.JavaSyntax.task07;

import java.util.ArrayList;
import java.util.Scanner;

/*Удваиваем слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Выведи результат на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Метод doubleValues должен удваивать элементы списка по принципу a,b,c -> a,a,b,b,c,c..
4. Выведи получившийся список на экран, каждый элемент с новой строки.
*/

public class Solution0717 {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list =  new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10;i++){
            list.add(scanner.nextLine());
        }
        ArrayList<String> result = doubleValues(list);
        for (String s : result){
            System.out.println(s);
        }
        // Вывести на экран result
    }

    private static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0;i < list.size();i++){
            list.add(i, list.get(i));
            i++;
        }
        return list;
    }
}
