package ThinkingInJava.Chapter5;

public class Dog {
    private void bark(int i, String name){
        System.out.println(i + " раз " + name + " залаял.");
    }
    private void bark(String name, int i) {
        System.out.println("Собак зовут " + name + ", ему " + i + " лет.");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(7,"Барсик");
        dog.bark("Барсик", 7);
        Cat cat =  new Cat();
    }
    private static class Cat {}
}
