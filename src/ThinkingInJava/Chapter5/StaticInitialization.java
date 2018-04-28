package ThinkingInJava.Chapter5;
//инициализация переменной в статическом блоке
public class StaticInitialization {
    static String s = "Hello";
    static String d;
    static {
        d = "world";
    }
    private static void outer(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        outer(s);
        outer(d);
    }
}