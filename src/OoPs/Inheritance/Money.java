package OoPs.Inheritance;

public class Money {
    static int MachineSerial=12142342;
    int value;
    int serial;

    public Money(int value, int serial) {
        this.value = value;
        this.serial = serial;
    }
}


      class MonetPrint {
     static void main(String[] args) {
        System.out.println(Money.MachineSerial);
        Money hundred = new Money(100,123456);
        System.out.println(hundred.serial);
        Money fifty = new Money(50,5354435);
        System.out.println(Money.MachineSerial);
        System.out.println(fifty.serial);

    }
}
