package ThinkingInJava.Chapter3;

public class PrefikcPostfiks {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);
        System.out.println(++i);//префиксный инкремент
        System.out.println(i++);//постфиксный инкремент
        System.out.println(i);
        System.out.println(--i);//префиксный декремент
        System.out.println(i--);//постфиксный декремент
        System.out.println(i);
    }
}
