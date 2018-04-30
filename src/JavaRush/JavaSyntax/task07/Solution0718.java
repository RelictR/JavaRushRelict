package JavaRush.JavaSyntax.task07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента,
нарушающего такую упорядоченность.
*/
public class Solution0718 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        int i = list.get(0).length();
        for (int j = 0; j < list.size(); j++) {
            if (i < list.get(j).length()){
                i = list.get(j).length();
            }
            if (i > list.get(j).length()){
                System.out.println(j);
            }
        }
    }
}