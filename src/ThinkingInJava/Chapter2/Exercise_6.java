package ThinkingInJava.Chapter2;
//Метод storage указывает, сколько байтов нужно для хранения определенной строки
public class Exercise_6 {
    static int storage(String s) {
        return s.length()*2;
    }
    public static void main(String[] args) {
        String a = "Александр";
        System.out.println(storage(a));
    }
}
