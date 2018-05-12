package JavaRush.JavaSyntax.task08;
import java.util.ArrayList;
/*Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать,
трое детей и выводить все объекты Human на экран.
*/
public class Solution0824 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human( "Алена",false, 1  );
        Human child2 = new Human( "Виталина",false, 8  );
        Human child3 = new Human( "Данила",true, 4 );
        ArrayList<Human> childrenNew = new ArrayList<>(  );
        childrenNew.add( child1 );
        childrenNew.add( child2 );
        childrenNew.add( child3 );
        Human father = new Human( "Евгений",true, 25,childrenNew );
        Human mother = new Human( "Светлана",false, 28,childrenNew );
        ArrayList<Human> childrenOld1 = new ArrayList<>(  );
        ArrayList<Human> childrenOld2 = new ArrayList<>(  );
        childrenOld1.add( father );
        childrenOld2.add( mother );
        Human grandfather1 = new Human( "Дед Иван",true, 80, childrenOld1 );
        Human grandmother1 = new Human( "Бабушка Нина",false, 80, childrenOld1 );
        Human grandfather2 = new Human( "Дед Анатолий",true, 55, childrenOld2  );
        Human grandmother2 = new Human( "Бабушка Ира",false, 48,childrenOld2  );

       System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
    }
    public static class Human {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<>(  );
        String name;
        boolean sex;
        int age;
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
