package ThinkingInJava.Chapter7;
//совмещение композици и наследования
class Plate{
    Plate(int i) {
        System.out.println("Const. Plate");
    }
}
class DinnerPlate extends Plate {
    DinnerPlate(int i){
        super(i);
        System.out.println("Const. DinnerPlate");
    }
}
public class PlaceSetting extends DinnerPlate {
   private Plate pl;
   private DinnerPlate dp;
   public PlaceSetting(int i){
       super(i + 1);
       pl = new Plate(i + 2);
       dp = new DinnerPlate(i + 3);
       System.out.println("Const PlaceSetting");
   }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(10);
    }
}
