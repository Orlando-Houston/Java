package Enum;

public class WeekDays {
    enum Days{
        MONDAY,TUEASDAY,WEDNSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }

    public static void main(String[] args) {
        for (Days day:Days.values ()){
            System.out.println (day);
        }
    }
}
