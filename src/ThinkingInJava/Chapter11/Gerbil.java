package ThinkingInJava.Chapter11;

import java.util.ArrayList;

public class Gerbil {
    private int gerbilNumber;
    public Gerbil(){
        gerbilNumber++;
    }
    public String hop(){
        return ("Object Gerbil is " + gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gerbils.add(new Gerbil());
        }
        for (int i = 0; i < gerbils.size(); i++) {
            System.out.println(gerbils.get(i).hop());
        }
        for(Gerbil s : gerbils){
            System.out.println(s);
        }
    }
}
