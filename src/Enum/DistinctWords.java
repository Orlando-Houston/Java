package Enum;

import java.util.HashSet;

public class DistinctWords {
    public static void main(String[] args) {
        String sentence = "java is java";
        String words[] = sentence.split(" ");
        HashSet<String> distinct = new HashSet<> ();
        for (String word : words){
            distinct.add(word);
        }
        System.out.println(distinct);
    }
}
