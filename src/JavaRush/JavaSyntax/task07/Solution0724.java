package JavaRush.JavaSyntax.task07;

/*Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и
заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
....
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/
public class Solution0724 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfather1 = new Human("Дед Ваня", true, 80);
        Human grandfather2 = new Human("Дед Анатолий", true, 58);
        Human grandmother1 = new Human("Баба Нина", false, 80);
        Human grandmother2 = new Human("Баба Ира", false, 49);
        Human father = new Human("Евгений",true, 25, grandfather2, grandmother1);
        Human mother = new Human("Светлана",false,28,grandfather2, grandmother2);
        Human child1 = new Human("Виталина", false, 8, null, mother);
        Human child2 = new Human("Даниил", true, 4, father, new Human("Анастасия",false,24));
        Human child3 = new Human("Вероника", false, 1, father, null);
        //выводна экран
        /*System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());*/
        grandfather1.toSString();//можно и так
    }
    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        //Constructor №1
        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        //Constructor №2
        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public void toSString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;
            //return text;
            System.out.println(text);
        }
    }
}
