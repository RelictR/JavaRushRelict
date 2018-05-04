package ThinkingInJava.Chapter7;

//вызовы конструкторов при проведении наследования

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Constructor Cartoon");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
class Art {
    Art(){ System.out.println("Constructor Art"); }
}
class Drawing extends Art {
    Drawing(){
        System.out.println("Constructor Drawing");
    }
}
