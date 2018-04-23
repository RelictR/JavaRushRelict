package JavaRush.JavaSyntax.task07;
/*
Массив из строчек в обратном порядке
        1. Создать массив на 10 строк.
        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.


        Требования:
        1. Программа должна создавать массив на 10 строк.
        2. Программа должна считывать 8 строк для массива с клавиатуры.
        3. Программа должна выводить 10 строк, каждую с новой строки.
        4. Все строки массива (10 элементов) должны быть выведены в обратном порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution0702 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] lines = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
           lines[i] = reader.readLine();
        }
        for (int i = lines.length - 1; i >= 0 ; i--) {
            System.out.println(lines[i]);
        }
    }
}