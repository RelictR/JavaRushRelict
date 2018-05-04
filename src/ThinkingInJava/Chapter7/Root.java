package ThinkingInJava.Chapter7;
class Component1{Component1(){
    System.out.println("Component1");
}}
class Component2{Component2(){
    System.out.println("Component2");
}}
class Component3{Component3(){
    System.out.println("Component3");
}}
public class Root {
    Root(){
        System.out.println("Root");
    }

    public static void main(String[] args) {
        Root r1 = new Root();
        Component1 c1 = new Component1();
        Component2 c2 = new Component2();
        Component3 c3 = new Component3();
    }

}
class Stem extends Root {
    public static void main(String[] args) {
        Component1 c1_1 = new Component1();
        Component2 c2_2 = new Component2();
        Component3 c3_3 = new Component3();
    }

}
