package ThinkingInJava.Chapter3;
//тернарный оператор
public class TernaryVsIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }
    static int standartIfElse(int i){
        if(i < 10)
            return i * 100;
        else
            return i * 10;
    }

    public static void main(String[] args) {
        System.out.println (ternary (9));
        System.out.println (ternary (10));
        System.out.println (standartIfElse (9));
        System.out.println (standartIfElse (10));
    }
}
