package ArraysMix;

public class CommonElement {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6,11};
        int[] array2={4,9,3,55,11,9,4,4,66};
        findCommons(array1,array2);
    }

    static void findCommons(int a[],int[] b){

        for(int i=0;i<a.length;i++){
            int counter=0;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    counter++;

                }
            }
            if(counter>0){
                System.out.println(a[i]);
            }
        }
    }
}
