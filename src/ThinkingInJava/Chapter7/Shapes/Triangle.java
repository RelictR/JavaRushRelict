package ThinkingInJava.Chapter7.Shapes;

public class Triangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Triangle.erase()");
    }
    @Override
    public void write(){
        System.out.println("Triangle.write");
    }
}
