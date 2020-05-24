package ArraysMix;

public class ArraySum {

        public static void main(String[] args) {
            int[] myNumbers={1,34543,55,465,7656,756,765,786,8768,8};

            int sum=0;

            for(int i=0 ; i<myNumbers.length ; i++){
                sum+=myNumbers[i];
            }

            System.out.println(sum);
        }
}
