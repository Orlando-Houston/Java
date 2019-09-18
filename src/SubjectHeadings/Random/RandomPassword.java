package SubjectHeadings.Random;

public class RandomPassword {
    /*
Create random passwords according to rules below​
Create 2D String Array with elements below​
Upper case Letters (index 0  )​
Lower case letter (index 1)​
Special characters (index 2) { @ # - + _ * & ^ $ ~ . |}​
Numbers (index 3) ​
3 UPPER CASE + 3 LOWER CASE + 1 SPECIAL CHAR + 4 NUMBERS
 */
    public static void main(String[] args) {
            System.out.println(generateRandomPass());


        }

        public static String generateRandomPass() {
            String password=" ";
            String[][]myValue={
                    {"A","B","C","D","E"},
                    {"a","b","c","d","e"},
                    {"@","%","#","%","*"},
                    {"1","2","3","4","5"},
            };

            double rand;
            for (int i=1;i<4;i++){
                rand=Math.random()*5;
                password=password+myValue[0][(int)rand];

            }
            for (int j=1;j<4;j++){
                rand=Math.random()*6;
                password=password+myValue[1][(int)rand];
            }
            rand=Math.random()*6;
            password=password+myValue[2][(int)rand];
            for (int k=1;k<3;k++){
                password=password+myValue[3][(int)rand];
            }

            return password;


        }
    }


