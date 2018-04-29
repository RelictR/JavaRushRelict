package ThinkingInJava.Chapter5;

public class SpicinessTest1 {
    public static void main(String[] args) {
        for (Money s : Money.values())
            System.out.println(s + " " + s.ordinal());
    }
}
