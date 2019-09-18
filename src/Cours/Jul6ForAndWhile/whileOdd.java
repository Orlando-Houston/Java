package Cours.Jul6ForAndWhile;

public class whileOdd {
    public static void main(String[] args) {
        // 1 ile 100 arasinda 3 e ve 7 ye bolunebilen sayilar

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("" + i);
            }
        }
    }
}