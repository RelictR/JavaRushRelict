package JavaRush.JavaSyntax.task08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/
public class Solution0827 {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 5 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat newDate = new SimpleDateFormat( "MMMMM dd yyyy", Locale.US );
        Date currentTime = newDate.parse( date );
        Date yearStartTime = new Date();

        yearStartTime.setDate( -1 );      // первое число
        yearStartTime.setMonth( 0 );      // месяц январь, нумерация для месяцев 0-11
        yearStartTime.setYear( currentTime.getYear() );

        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance / msDay); //количество целых дней
        if (dayCount %2 != 0)
        return true;
        else
            return false;
    }
}
