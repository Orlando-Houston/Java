package SubjectHeadings.HomeWork;

public class DiamondSabire {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){    // 1  column

            for ( int s=0;s<=10-i;s++){        // 3 space
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){   //2 rows
                System.out.print("* ");
            }
            System.out.println();
        }


       for (int i=9;i>=0;i--){


          for ( int s=0;s<=10-i;s++){
                System.out.print(" ");
            }
          for (int j=0;j<=i;j++){
              System.out.print("* ");
          }
           System.out.println();

       }
   }
}




//1 st loop for column
//2nd for raws
//3rd loop for space
//now same work in revers print diamond
//how to create diamond in java by abdullah
//alt kismi kapat.space bosluklari olusturulmadi.S<=10 iken dik ucgen olustu.
//S<= 10-i  iken  iki parantezede birer space yapildi..piramid oldu
//S<=10-i iken bosluga one space, yildiza space yapmadim.ters dik ucgen oldu.
//alt kismi actim..butun bosluk ve yildizlara bir space yaptim..dismond olustu.
