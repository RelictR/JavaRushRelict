package ThinkingInJava.Chapter10;
//создание внутренни классов
public class Parsel1 {
    class Contents {
        private int i = 11;
        public int value() {return i;}
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel(){return label;}
    }
    //использование внутренних классов очень похоже на использование любых других классов в пределах Parcel1
    public  void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parsel1 p = new Parsel1();
        p.ship("Танзания");
    }
}
