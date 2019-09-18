package Cours.Jul29DimensionalArray;

public class RandomPassword {
    public static void main(String[] args) {
        System.out.println(generateRandomPass());
    }
    public static String generateRandomPass(){
        String password = "";
        String[][] myValues = {
                {"A","B","C","D","E","F","G"},
                {"a","b","c","d","e","f","g"},
                {"@", "#", "-" ,"+", "_", "*", "&", "^", "$", "~" ,".", "|"},
                {"1","2","3","4","5","6"}
        };
        double rand;
        for(int i=1 ; i<4 ; i++){
            rand = Math.random()*7;
            password = password + myValues[0][(int) rand];
        }
        for(int j=1 ; j<4 ; j++){
            rand = Math.random()*7;
            password = password + myValues[1][(int)rand];
        }
        rand = Math.random()*12;
        password = password + myValues[2][(int)rand];
        for(int k=1 ; k<5 ; k++){
            rand = Math.random()*6;
            password = password + myValues[3][(int)rand];
        }

        return password;
    }
}

