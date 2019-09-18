package SubjectHeadings.Arrays.ArrayMyReview;

public class LargestVirginia {
    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }

        }
        return longestString;
    }

    public static void main(String[] args) {
        String[] cities = {"Alabama", "Utah", "Oregon","Virginia","Texsas"};
        String longestString = getLongestString(cities);
        System.out.format("longest string:"+ longestString);
    }

}



