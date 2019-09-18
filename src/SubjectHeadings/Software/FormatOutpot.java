package SubjectHeadings.Software;

public class FormatOutpot {
    public static void main(String[] args) {
        System.out.println("What do you think about Java ,good /not");
        float  number=78.89f;

        //System.out.println("Yes,%78.89 think Java is good");
        System.out.printf("Yes %%%f of people think that Java is good,",number);


        float number1=1.5f;
        System.out.printf("No %%%f of people think that Java is good,",number1);


        float total=100.00f;
        Float calculation=total-(number+number1);
        System.out.printf("%%%f hesitant:" ,calculation);

        //printf kullaniyoruz.Why?&& lik sayilari





    }
}
