package Cours.Aug25Computer;
import java.util.Arrays;


public class Laptop extends Mobiles implements Computers{
    private String[] mainBoardSpecs;
    int memorySize;
    int cpuSpeed;
    private   String cpuType;
    int batteryPercentage;

    public Laptop(String[] mainBoardSpecs, int memorySize, int cpuSpeed, String cpuType){
        this.mainBoardSpecs = mainBoardSpecs;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
        this.batteryPercentage=10;
    }

    public String[] getMainBoardSpecs() {
        return mainBoardSpecs;
    }

    public void setMainBoardSpecs(String[] mainBoardSpecs) {
        this.mainBoardSpecs = mainBoardSpecs;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public void setMainBoard(){
        System.out.println("Mainboard is set");
    }

    public void installCPU(){
        if(this.cpuType.equals(this.mainBoardSpecs[0])) {
            System.out.println("CPU installed");
        }
        else {
            System.out.println("CPU is no compitable");
        }
    }

    public void installMemory(){
        System.out.println("Memory installed");

    }
    public void turnWifiOn(){
        System.out.println("Wifi is ON");
    }
    public void turnWifiOf(){
        System.out.println("Wifi is OFF");
    }
    public void chargeBattery(int percentage){
        this.batteryPercentage = this.batteryPercentage + percentage;
    }
    public void showBatteryPercentage(){
        System.out.println("Charge level is: " +this.batteryPercentage);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "mainBoardSpecs=" + Arrays.toString(mainBoardSpecs) +
                ", memorySize=" + memorySize +
                ", cpuSpeed=" + cpuSpeed +
                ", cpuType='" + cpuType + '\'' +
                ", batteryPercentage=" + batteryPercentage +
                '}';
    }
}
