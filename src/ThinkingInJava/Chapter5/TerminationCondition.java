package ThinkingInJava.Chapter5;
//использоване finalize() для выявления обьекта, не осуществившего необходимой финализации
class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    public void finalize(){
        if (checkedOut)
            System.out.println("Ошибка: checkedOut");
    }
}
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        //Правильная очистка
        novel.checkIn();
        //Теряем ссылку, заблыи про очистку:
        new Book(true);
        //Принулительная уборка мусора и финализация
        System.gc();
    }
}
