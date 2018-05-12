package JavaRush.JavaSyntax.task08;
import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/
public class Solution0818 {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>(  );
        map.put("Решетников", 1000);
        map.put("Иванов", 450);
        map.put("Петров", 1200);
        map.put("Сидоров", 550);
        map.put("Волков", 200);
        map.put("Воронов", 300);
        map.put("Ветков", 4000);
        map.put("Хвостов", 500);
        map.put("Куликов", 1200);
        map.put("Скворцов", 300);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> mapRemPerson = new HashMap<>( map );
        for (Map.Entry<String, Integer> pair : mapRemPerson.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (value < 500){
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {
    }
}