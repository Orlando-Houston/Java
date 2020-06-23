package Enum;

public class App {
    public static void main(String[] args) {

        Days days = Days.Sali;
        System.out.println(days);

        Month month = Month.Nisan;
        System.out.println(month + " yilin " + month.getMonth() +". ayidir.");

    }
}
