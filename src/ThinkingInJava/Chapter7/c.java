package ThinkingInJava.Chapter7;
class b {
    b(int i){
        System.out.println("constructor b");
    }
}
class a extends b{
    a(int i){
        super(2);
        System.out.println("constructor a");
    }
    public static void main(String[] args) {
        c test = new c(5);
    }
}
public class c extends a{
    c(int i){
        super(7);
        System.out.println("constructor c");
    }

}
