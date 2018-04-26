package ThinkingInJava.Chapter4;
//программа генерирует 25 случайных чисел и проверяет в каком отношении значение находится с другим сгенерированным числом

public class random25 {
    public static void main(String[] args) {
        while (true) {
          double a = Math.random ();
          if (a > Math.random ())
              System.out.println (a + " > " + Math.random ());
          else if (a < Math.random ())
              System.out.println (a + " < " + Math.random ());
          else if (a == Math.random ())
              System.out.println (a + " = " + Math.random ());
        }
    }
}
