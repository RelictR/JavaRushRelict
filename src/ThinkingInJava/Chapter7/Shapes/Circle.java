package ThinkingInJava.Chapter7.Shapes;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Circle.erase()");
    }
    @Override
    public void write(){
        System.out.println("Circle.write");
    }
}
