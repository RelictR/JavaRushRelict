package ThinkingInJava.Chapter7;


class TC2 extends TC {
    TC2(){
        System.out.println("FC2");
    }
    TC2(int i){
        super(5);
        System.out.println("WA2");
    }
}
public class TC {
    TC(){
        System.out.println("FC");
    }
    TC(int i){
        System.out.println("WA");
    }

    public static void main(String[] args) {
        TC2 newTC2 = new TC2(10);
    }
}