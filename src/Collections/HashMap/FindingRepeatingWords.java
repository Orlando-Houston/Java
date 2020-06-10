package Collections.HashMap;

import java.util.HashMap;

public class FindingRepeatingWords {
    public static void main(String[] args) {
        String sentence="the best way to learn java is practice way java using java and java";
        findRepeatings(sentence);
    }
    public static void findRepeatings (String sentence){
        sentence=sentence.toUpperCase(); //convert all chars to Upper.
        String[] words = sentence.split(" ");//convert to String array (1 word in each element)
        //find the frequencies of the words
        HashMap<String,Integer> wordCounts = new HashMap<> ();
        for(String word : words){
            if(wordCounts.containsKey(word)){
                wordCounts.put(word,wordCounts.get(word)+1);
            }
            else{
                wordCounts.put(word,1);
            }
        }
        System.out.println("REPEATING WORDS :");
        for(String key : wordCounts.keySet()){
            if(wordCounts.get(key)>1){
                System.out.println(" --- "+key+" = \t"+wordCounts.get(key));
            }
        }
    }
}
