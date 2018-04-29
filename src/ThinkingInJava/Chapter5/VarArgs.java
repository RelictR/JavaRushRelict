package ThinkingInJava.Chapter5;
//Использование синтаксиса массивов для получения переменного списка параметров
class A {int i;}
public class VarArgs {
    static void printArray(Object... args){
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();//перенос строки
    }

    public static void main(String[] args) {
        printArray(47, 3.14f, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
    }
}
