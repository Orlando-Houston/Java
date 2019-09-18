package SubjectHeadings.ScannerClass;

public class Scan25 {
    public static void main(String[] args) {
        int month=2;
        String monthString="";
        switch(month){
            case 1:monthString="January";
                break;
            case 2:monthString="February";
                break;
            case 3:monthString="March";
                break;
            case 4:monthString="April";
                break;
            case 5:monthString="May";
                break;
            case 6:monthString="Jun";
                break;
            case 7:monthString="Jul";
                break;
            case 8:monthString="Aug";
                break;
            case 9:monthString="Sep";
                break;
            case 10:monthString="Oct";
                break;

            case 11:monthString="November";
                break;
            case 12:monthString="December";
                break;
            default:
                System.out.println("Invalid");

        }
        System.out.println(monthString);


    }
}


