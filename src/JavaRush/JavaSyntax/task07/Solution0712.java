package JavaRush.JavaSyntax.task07;

import java.util.ArrayList;
import java.util.Scanner;
/*
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.

*/
public class Solution0712 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        String maxLength = list.get(0);
        String minLength = list.get(0);
        for (String s : list){
            if (s.length() > maxLength.length())
                maxLength = s;
            else if (s.length() < minLength.length())
                minLength = s;
        }
        if (list.indexOf(maxLength) < list.indexOf(minLength))
        System.out.println(maxLength);
        else
            System.out.println(minLength);
    }
}
