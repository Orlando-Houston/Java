package SubjectHeadings.HomeWork;


public class Forecast2 {
    public static void main(String[] args) {
        String column=("DAY");
        String column1=("NAME");
        String column2=("DESC");
        String column3=("PRECI");
        String column4=("WINDSPE");
        String column5=("HUMIDITY");
        System.out.printf("%-5s\t%-10s\t%-5s\t%-7s\t%-9s\t%-6s\n",column,column1,column2,column3,column4,column5);

        int day1=1;
        String nameDay="Fri";
        String dis="Thund";
        int preci=95;
        String sideOfWind="N";
        int windSpeed=32;
        int humidity=93;
        System.out.printf("%-5d\t%-10s\t%-5s\t%-5d\t%3s%-1dmph\t  %%%-12s\n",day1,nameDay,dis,preci,sideOfWind,windSpeed,humidity);


        int day2=2;
        String nameDay1="Sat";
        String dis1="Thund";
        int preci1=95;
        String sideOfWind1="N";
        int windSpeed1=32;
        int humidity1=93;
        System.out.printf("%-5d\t%-10s\t%-5s\t%-5d\t%3s%-1dmph\t  %%%-12s\n",day2,nameDay1,dis1,preci1,sideOfWind1,windSpeed1,humidity1);








    }
    }