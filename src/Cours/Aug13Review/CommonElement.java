package Cours.Aug13Review;

public class CommonElement {
    public static void main(String[] args) {
        int list1[]={1,2,3,4,5,6,7,8,9};
        int list2[]={5,7,12,4,55,67,99};


        int i=0;
        int j=0;
        while (i<list1.length&&j<list2.length){
            if (list1[i]==list2[j]){
                System.out.println(list1[i]);
                i++;
                j++;
            }
            else if (list1[i]>list2[j]){
                j++;
            }
            else{
                i++;
            }
        }
    }
}
