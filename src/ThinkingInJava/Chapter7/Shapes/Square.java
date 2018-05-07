package ThinkingInJava.Chapter7.Shapes;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
    @Override
    public void write(){
        System.out.println("Square.write");
    }
}
