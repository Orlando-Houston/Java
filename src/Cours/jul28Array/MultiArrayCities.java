package Cours.jul28Array;
/*
1) Create random 2-dimensional String array with city names​
2) print cities with first letter is "A"​
3) print all city names reversed​
4) print city names starts with between a-h
5) print city names has letter a in it
 */

public class MultiArrayCities {
    public static void main(String[] args) {
        String[][]cities={
                {"Arlington","Richmond","Albany","Phoneix"},
                {"Houston","Charlotte","Baton Rouge","Oklahama City","Boulder"},
                {"San Diego","Atlanta","Miami","Austin","Mineapolis","San Fransisco"},
                {"Kansas city","Pittburg","Los Angeles","Seatle"}};
       // printCitiesWithFirstLetterA(cities);
       // printCitiesReversed(cities);
       // printCitiesBetweenAAndH(cities);
        System.out.println("--------");

        printCitiesHasA(cities);
    }

    public static void printCitiesHasA(String[][] cities){
        int counter = 0;
        for(int i=0 ; i<cities.length ; i++){
            for(int j=0 ; j<cities[i].length ; j++){
                for(int k=0 ; k<cities[i][j].length();k++ ){
                    if(cities[i][j].charAt(k)=='a' || cities[i][j].charAt(k)=='A'){
                        counter++;
                        //System.out.print(cities[i][j].charAt(k)+"OK");
                    }
                }
                if(counter>0){
                    System.out.println(cities[i][j]);
                }
                counter=0;
                //System.out.println();
            }
        }
    }

    public static void printCitiesReversed(String[] []cityArray) {
        String city=null;
        int theLastIndex=0;
        for (int i=0; i<cityArray.length;i++){
            for (int j=0;j<cityArray[i].length;j++){
                city=cityArray[i][j];
                theLastIndex=city.length()-1;

              for (int k=theLastIndex;k>=0;k--){
                  System.out.print(city.charAt(k));
              }
                System.out.println();
            }
        }

    }

    public static void printCitiesWithFirstLetterA(String[][] cityNames) {
        for (int i=0;i<cityNames.length;i++){
            for (int j=0;j<cityNames[i].length;j++){
                String city=cityNames[i][j];
                if (city.charAt(0)=='A'){
                    System.out.println(cityNames[i][j]);
                }

            }
            }
        }
    public static void printCitiesBetweenAAndH(String[][] myCities) {
        for ( int i=0;i<myCities.length;i++) {
            for (int j = 0; j < myCities.length; j++) {
                if (myCities[i][j].charAt(0) >= 65 && myCities[i][j].charAt(0)<= 72){
                    System.out.println(myCities[i][j]);
                }

            }

        }
    }

}