package ThinkingInJava.Chapter5;

public class OptionalTrailingArguments {
    private static void f(int required, String... training) {
        System.out.print("Обязательно: " + required + " ");
        for (String s : training)
            System.out.print(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "один");
        f(2, "два", "три");
        f(0);

    }
}
