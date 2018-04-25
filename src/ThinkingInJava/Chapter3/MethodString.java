package ThinkingInJava.Chapter3;

public class MethodString {
    private static void methodString(String a, String b) {
        System.out.println (a == b);
        System.out.println (a != b);
        System.out.println (a.equals (b));
        System.out.println (a = b);
        System.out.println ("Buy");
    }
    public static void main(String[] args) {
        methodString ("Мир","Мир");
    }

}
