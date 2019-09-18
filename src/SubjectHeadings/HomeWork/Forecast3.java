package SubjectHeadings.HomeWork;

import java.util.Scanner;

public class Forecast3 {
    public static void main(String[] args) {


        Scanner forecastInfo=new Scanner(System.in);


        System.out.println("Please Write day");
        String day=forecastInfo.next();


        System.out.println("Description");
        String description=forecastInfo.next();

        System.out.println("Precip");
        int precip=forecastInfo.nextInt();


        System.out.println("Windward");
        String windward=forecastInfo.next();

        System.out.println("windspeed");
        int windspeed=forecastInfo.nextInt();


        System.out.println("Humidity");
        int humidity=forecastInfo.nextInt();


    }
}
