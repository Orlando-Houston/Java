package Oracle;

public class O79Arr {
    public static void main(String[] args) {
        int [][] num={{1,3},
                      {2,4}};
        for (int i=num.length-1;i>=0;i--){
            for (int newList:num[i]){
                System.out.println (newList);
            }
        }

    }
        }


