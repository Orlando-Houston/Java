package SubjectHeadings.HomeWork;

public class AArrayLengthNadide {
    public static void main(String[] args) {
        String[]city={"aaa","bb","cccc","ee","wertyw"};
        int maxLength=0;
        int maxIndex=-1;

        for (int i=0;i<city.length;i++) {
            if (city[i].length() > maxLength) {
                maxLength = city[i].length();
                maxIndex = i;
            }

            System.out.println(maxIndex);
                System.out.println(maxLength);


            }
        }
    }

