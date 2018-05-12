package JavaRush.JavaSyntax.task08;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
/*
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution0816 {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("AUGUST 1 1980"));
        map.put("Poppins", new Date("JANUARY 1 1980"));
        map.put("Darvin", new Date("MAY 2 1990"));
        map.put("Pushkin", new Date("JUNE 5 1980"));
        map.put("Clains", new Date("JANUARY 11 1980"));
        map.put("Versace", new Date("JANUARY 17 1980"));
        map.put("Shwarzeneger", new Date("JUNE 23 1980"));
        map.put("Stradivari", new Date("JANUARY 21 1980"));
        map.put("Chaplin", new Date("JUNE 20 1980"));
        map.put("Pit", new Date("AUGUST 4 1980"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<HashMap.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()){
            HashMap.Entry<String, Date> pair = it.next();
            Date d = pair.getValue();
            if (d.getMonth() >= 5 && d.getMonth() <= 7){
                it.remove();
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}


