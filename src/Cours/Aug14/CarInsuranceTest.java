package Cours.Aug14;

public class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance myOffer = new CarInsurance(2012,0,0,200);
        myOffer.makeOffer(2019);
        myOffer.setModelYear(2015);
        myOffer.makeOffer(2019);
        myOffer.setAccidents(-50);
        myOffer.makeOffer(2019);
    }

}
