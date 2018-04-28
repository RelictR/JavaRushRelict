package ThinkingInJava.Chapter5;
//вызов одного конструктора из другого
public class TestThis2 {
    TestThis2(){
        this("Bro!");//вот тут происходит вызов второго конструктора
    }
    TestThis2(String s){
        System.out.println("Hello, " + s);
    }

    public static void main(String[] args) {
        TestThis2 a = new TestThis2();
    }
}
