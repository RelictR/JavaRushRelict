package JavaRush.JavaSyntax.task07;

/*
Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.


Требования:
1. Объяви переменную типа список целых чисел и сразу проинициализируй ee.
2. Считай 10 целых чисел с клавиатуры и добавь их в список.
3. Выведи числа в обратном порядке.
4. Используй цикл for.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution0719 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }
}
