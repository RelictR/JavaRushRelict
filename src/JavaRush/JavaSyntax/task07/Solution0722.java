package JavaRush.JavaSyntax.task07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
3. Саму строку "end" не нужно добавлять в список.
4. Выведи список на экран, каждое значение с новой строки.
5. Используй цикл for.
*/

public class Solution0722 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0;true; i++) {
            lines.add(reader.readLine());
            if (lines.get(i).equals("end"))
                break;
        }
        lines.remove("end");
        for (String s : lines){
            System.out.println(s);
        }
    }
}
