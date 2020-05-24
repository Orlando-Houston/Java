package ArraysMix;

public class First {
    public static void main(String[] args) {
        String[] cities = {"New York","Seattle","San Diego","Boulder","Ann Arbor"};

        for (int i=0 ; i<5 ; i++){
            System.out.println(cities[i]);
        }

        for(int i=cities.length-1;i>=0;i--){
            System.out.println(cities[i]);
        }
    }
}


