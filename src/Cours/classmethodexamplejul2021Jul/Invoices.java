package Cours.classmethodexamplejul2021Jul;

public class Invoices {

    //method to evaluate Electric consumption
    public String evaluateElectric(int consumption) {
        String result = "";
        if (consumption > 500 && consumption < 1000) {
            result = "Good Job";
        } else if (consumption >= 1000 && consumption < 1500) {
            result = "Not bad";
        } else if (consumption >= 1500) {
            result = "Start to save Energy";
        } else {
            System.out.println("Consumption is out of scope");
        }
        return result;

    }

        //method to evaluate internet bill





    public String evaluateInternetBill(int speed) {
        String result = "";
        if (speed > 100 && speed < 300) {
            result = "Good Speed";

        } else if (speed > 300) {
            result = "OoPs.Super Speed";
        } else {
            System.out.println("Speed is out of scope");

        }
        return result;

    }

}
