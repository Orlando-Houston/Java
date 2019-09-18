package SubjectHeadings.HomeWork;

public class ArrayShortLength {
    public static void main(String[] args) {
       String[] city = {"Istanbul", "Artvin", "Edirne", "Van", "Hatay"};

        int shortOfElement = 0;
        int minLetterIndex = 0;
        String word = " ";

        for (int i = 0; i < city.length; i++) {
            if (city[i].length() >shortOfElement) {


                System.out.println(shortOfElement);
                System.out.println(minLetterIndex);
                System.out.println(city[i]);
                System.out.println(i);

            }
        }
    }


}
