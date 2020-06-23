package Enum;

import java.util.Arrays;

public class Colors {
    public enum Color{
        MAROON(155,200,150),
        TEAL(10,180,230),
        ZERO_GRAVITY(10,20,30);

        private int red;
        private int green;
        private int blue;

        Color(final int red,final int green, final int blue){
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
        public int red(){
            return this.red;
        }
        public int green(){
            return this.green;
        }
        public int blue(){
            return this.blue;
        }
        public int[] colors(){
            int allColors[] = new int[3];
            allColors[0]=this.red;
            allColors[1]=this.green;
            allColors[2]=this.blue;
            return allColors;
        }
    }

    public static void main(String[] args) {
        Color myColor = Color.MAROON;
        System.out.println(Arrays.toString(myColor.colors()));
    }


}
