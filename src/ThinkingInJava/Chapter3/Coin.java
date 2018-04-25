package ThinkingInJava.Chapter3;

public class Coin {
    String side;

    public static void main(String[] args) {
        Coin side1 = new Coin ();
        Coin side2 = new Coin ();
        Coin side3 = new Coin ();
        side1.side = "Орел";
        side2.side = "Решка";
        side3.side = "Ребро";
        System.out.println (side1.side);
        System.out.println (side2.side);
        System.out.println (side3.side);
    }
}
