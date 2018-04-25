package ThinkingInJava.Chapter3;

public class Dog {
    private String name, says;
    public static void main(String[] args) {
        Dog dog1 = new Dog ();
        Dog dog2 = new Dog ();
        Dog dog3 = new Dog ();
        dog3 = dog2;
        dog1.name = "Spot";
        dog2.name = "Scruffy";
        dog1.says = "Gav-gav";
        dog2.says = "Woooo";
        System.out.println (dog1.name + " says " + dog1.says);
        System.out.println (dog2.name + " says " + dog2.says);
        System.out.println (dog2.equals (dog3));
    }

}
