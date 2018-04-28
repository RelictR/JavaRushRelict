package ThinkingInJava.Chapter5;
//создание конструтора наглядно
public class TestConstructor {
    public TestConstructor(String s) {
        System.out.println("Hello " + s);
    }

    public static void main(String[] args) {
    TestConstructor testConstructor = new TestConstructor("World!");
    }
}
