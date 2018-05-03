package ThinkingInJava.Chapter7;

//Инициализация ссылки на обьект(примеры) 4 способа

class Soap {
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "Constructed";
    }
    public String toString() {return s;}
}

class Bath  {
    private String //инициализация в точке определения
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath(){
        System.out.println("In constructor Bath()");
        s3 = "Happy";
        toy  = 3.14f;
        castille = new Soap();
    }
    //инициализация экземпляра
    { i = 47;}
    public String toString(){
        if(s4 == null) //отложенная инициализация
            s4 = "Happy";
        return
                "s1 = " + s1 + "\n" +
                        "S2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}

public class LinkInitialization {

}
