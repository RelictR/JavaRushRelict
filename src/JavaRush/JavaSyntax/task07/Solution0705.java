package JavaRush.JavaSyntax.task07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массива на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести его на экран.
*/

public class Solution0705 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numbers = new int[20];
        int[] smallnumbers1 = new int[10];
        int[] smallnumbers2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        System.arraycopy(numbers,0,smallnumbers1,0,10);
        System.arraycopy(numbers,10,smallnumbers2,0,10);
        for (int i = 0; i < smallnumbers2.length; i++) {
            System.out.println(smallnumbers2[i]);
        }
    }
}
