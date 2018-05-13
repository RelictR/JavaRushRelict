package JavaRush.JavaSyntax.task08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/*
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.
Требования:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution0828 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String nameMonth = reader.readLine();
        Calendar cal = Calendar.getInstance();
        Map<String, Integer> map = cal.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.US);
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            if (nameMonth.equals( key )){
                System.out.println(key + " is the " + (value + 1) + " month");
            }
        }

    }
}
