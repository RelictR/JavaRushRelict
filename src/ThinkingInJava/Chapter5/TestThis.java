package ThinkingInJava.Chapter5;
//показана работа this
public class TestThis {

    public void testThis(){
        thisTest();
        this.thisTest();
    }
    private void thisTest() {
        System.out.println("This is this work");
    }
    public static void main(String[] args) {
        TestThis n = new TestThis();
        n.testThis();
    }
}
