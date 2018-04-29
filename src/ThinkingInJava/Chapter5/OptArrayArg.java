package ThinkingInJava.Chapter5;


public class OptArrayArg {
    private static  void f(int i, String... lines){
        for (String s : lines)
            System.out.println(i + " " + s + " ");
    }

    public static void main(String[] args) {
        f(10, "привет","Hello","buy");
        f(20,new String[]{"Hello","World"});
    }
}
