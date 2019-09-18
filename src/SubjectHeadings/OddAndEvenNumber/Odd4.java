package SubjectHeadings.OddAndEvenNumber;

public class Odd4 {
    public class oddNumbers1 {
        public  void main(String[] args) {
            int[]myArray={1,2,3,4,5,6,7,8,9,};
            int counter=0;
            for (int i=0;i< myArray.length;i++){
                if (myArray[i]%2!=0) {
                    counter = counter + 1;
                }
            }
            System.out.println(counter);
        }}}

