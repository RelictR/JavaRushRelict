package JavaRush.JavaSyntax.task07;

/*
Массивный максимум
        1. В методе initializeArray():
        1.1. Создайте массив на 20 чисел
        1.2. Считайте с консоли 20 чисел и заполните ими массив
        2. Метод max(int[] array) должен находить максимальное число из элементов массива
        Требования:
        1. Метод initializeArray должен создавать массив из 20 целых чисел.
        2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
        3. Метод max должен возвращать максимальный элемент из переданного массива.
        4. Метод main изменять нельзя.
        Решена!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Массивный максимум
*/

public class Solution0701 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] numbers = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            String s = reader.readLine();
            numbers[i] = Integer.parseInt(s);
        }
        return numbers;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}