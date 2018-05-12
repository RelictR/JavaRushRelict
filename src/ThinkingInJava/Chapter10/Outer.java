package ThinkingInJava.Chapter10;

public class Outer {
    class Inner {
        private String s;
        Inner(String s){
            this.s = s;
        }
    }
    public Inner to(String s){
        return new Inner(s);
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner in1 = o.to("Hello");
    }
}
