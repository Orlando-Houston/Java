package SubjectHeadings.HomeWork;

public class Forecast1 {
    public static void main(String[] args) {
        String day=("Day   "+"/"+"Tue:   "+"Fri:   "+"Sat:   "+"Sun:   "+"Mon:"   );
        System.out.println( day);
         //System.out.printf("%10s,%10s,%10s,%10s,%10s,"),"day,"/","Tue:","Fri:","Sat","Sun:","Mon");
        String description=("Description:   "+ "/"   +"Thund:"+"Suny:"+"Thund:"+"Cloudy:"+"Thund");
        System.out.println(description);
        String windside=( "Windside:       "+  "/"+   "ESE:"+   "ESE:"+   "WNW:"+   "WSW:"+   "ESW:");
        System.out.println(windside);
        int tu=10;
        int fr=8;
        int sat=7;
        int sun=8;
        int moon=9;
        System.out.println("windspeed:    "+   tu+   fr+   sat+   sun+    moon);
        int tu1=80;
        int fr1=40;
        int sat1=20;
        int sun1=40;
        int moon1=60;
        System.out.println("Precip:    "+   tu1+    fr1+    sat1+    sun1+   moon1);
        int tu2=92;
        int fr2=73;
        int sat2=80;
        int sun2=60;
        int moon2=50;
        System.out.println("humidity:    " +   tu2  +    fr2  +   sat2  +   sun2  +    moon2);

    }
}


