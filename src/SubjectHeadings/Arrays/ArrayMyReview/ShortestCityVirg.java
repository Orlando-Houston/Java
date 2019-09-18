package SubjectHeadings.Arrays.ArrayMyReview;

public class ShortestCityVirg {
    public static void main(String[] args) {
        String[] cities = {"Alabama", "Utah", "Oregon","Virginia","Texsas"};

        int shortOfElemnt=cities[0].length();
        int minLetterIndex=0;
        String word=" ";
        for (int i=0;i<cities.length;i++){

            if (cities[i].length()<shortOfElemnt){
                shortOfElemnt=cities[i].length();
                minLetterIndex=cities[i].length();

                System.out.println(shortOfElemnt);
                System.out.println(minLetterIndex);
                System.out.println(cities[i]);
                System.out.println(i);

            }
        }


}
}

