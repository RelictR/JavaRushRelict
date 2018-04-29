package ThinkingInJava.Chapter5;

public class OptMainArgs {
    public static void main(String... args) {
        for (String s : args)
            System.out.println(s);
        main("Hello","World","Respect");
    }
}
