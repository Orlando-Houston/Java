package Cours.Aug8;

public class ArrayOverLoding {
    public int returnIndex(int array[],int element ){
        int index=0;
        int found=0;
        for (int i=0;i<array.length;i++){
            if (element==array[i]){
                found=index;

            }
            index++;
        }
        return found;
    }
    public int returnIndex(String[]array,String element){
        int found=0;
        int index=0;
        for (String oneElement:array){
            if (oneElement.equals(element)){
                found=index;
            }
            index++;
        }
        return found;
    }


        }


