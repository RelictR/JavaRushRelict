package JavaRush.JavaSyntax.task08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution0823 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char i[] = s.toCharArray();
        for (int j = 0; j < i.length; j++) {
            if (j == 0){
                i[j] = Character.toUpperCase( i[j] );
            }
            if (i[j] == ' '){
               i[j + 1] = Character.toUpperCase( i[j + 1] );
            }

        }
        System.out.print(i);
    }
}
