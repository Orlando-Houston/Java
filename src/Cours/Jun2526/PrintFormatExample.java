package Cours.Jun2526;

public class PrintFormatExample {
    public static void main(String[] args) {
        int day=5;
        String month="September";
        int year=1970;
        char grade='A';
        int marks=99;
        System.out.printf("born on %dth-%s,%d\n",day,month,year);
        System.out.printf("Secured%d %%marks and %c grade",marks,grade);
    }
}
