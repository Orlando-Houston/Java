package SubjectHeadings.HomeWork;

public class ArrayCityNadLength {
    public static void main(String[] args) {
        String[] city = {"Istanbul", "Artvin", "Edirne", "Van", "Hatay"};
        int wordLetterLength = 0;
        int maxLetterIndex = 0;
        String word = "";


        for (int i = 0; i < city.length; i++) {


            if (city[i].length() > wordLetterLength) {  //her gordugumuz inin uzunlugu  en uzun kelimeden uzun olmali
                wordLetterLength = city[i].length();  //city deki en uzun kelimeye esit olacak

                maxLetterIndex=city[i].length();


                System.out.println(wordLetterLength);
                System.out.println(maxLetterIndex);
                System.out.println(city[i]);
                System.out.println(i);                  //index


            }



        }
    }
}


