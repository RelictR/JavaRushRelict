package ThinkingInJava.Chapter3;

public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer (47);
        Integer n2 = new Integer (47);
        System.out.println (n1 == n2);//сравнение только ссылки false
        System.out.println (n1 != n2);//сравнение только ссылки true
        System.out.println (n1.equals (n2));//сравнение содержимого обьектов true
    }
}
