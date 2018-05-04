package JavaRush.JavaSyntax.task07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.
*/

public class Solution0721 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        //напишите тут ваш код
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        int maximum = Collections.max(numbers);
        int minimum = Collections.min(numbers);
        System.out.print(maximum + " " + minimum);
    }
}
