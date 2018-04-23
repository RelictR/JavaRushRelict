package ThinkingInJava.Chapter2;

class Exercise_7 {
    static int i = 50;
    Exercise_7 st1 = new Exercise_7();
    Exercise_7 st2 = new Exercise_7();
}
class Incrementable {
    static void increment() {
        Exercise_7.i++;
    }

    Incrementable sf = new Incrementable();
}