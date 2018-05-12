package JavaRush.JavaSyntax.task08;

import java.util.HashMap;
/*
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из
10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution0815 {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Александр");
        map.put("Козлов", "Максим");
        map.put("Решетников", "Иван");
        map.put("Сидоров", "Николай");
        map.put("Васильев", "Владимир");
        map.put("Решетников", "Александр");
        map.put("Котов", "Виталий");
        map.put("Толстой", "Лев");
        map.put("Тургенев", "Виктор");
        map.put("Пушкин", "Александр");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int names = 1;
        for (HashMap.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (value.equals(name)) {
                names += 1;
                }
            }
            return names;
        }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int lastNames = 1;
            for (HashMap.Entry<String,String> pair : map.entrySet()){
                String key = pair.getKey();
                if(key.equals(lastName))
                    lastNames += 1;
            }
            return lastNames;
    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(),"Александр"));
        System.out.println(getCountTheSameLastName(createMap(),"Решетников"));
    }
}

