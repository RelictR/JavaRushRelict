package ThinkingInJava.Chapter5;

public class StringArray2 {
    StringArray2(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        StringArray2[] list = {
            new StringArray2("Hello"),
            new StringArray2("World"),
            new StringArray2("Buy")
        };
        System.out.println(list);
    }
}
