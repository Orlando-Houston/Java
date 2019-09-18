package SubjectHeadings.Software;

public class Conversions {

        public static void main(String[]args) {
            int celcius = 25;
            int fahreneit = celcius * 9 / 5 + 32;

            System.out.println(fahreneit);



            //32f-32*5/9
            int fahreneit1=32;
            int celcius1=(fahreneit1-32)*(5/9);
            System.out.println(celcius1);


            //1gr...0.0022 pound
            int gr=200;
            double lb= gr*0.0022;
            System.out.println( lb);

            double lb1=454;
            double gr1=lb1*1;
            System.out.println( gr1);

            //distance

            double km=1;
            double mil=km*0.621;
            System.out.println(mil);

            double mil1=1;
            double km1=mil1*1.609;
            System.out.println(km1);




        }

    }


