package Cours.Aug25Computer;

public class Computer {
    String[] boardSpecs;
    int memorySize;
    int cpuSpeed;
    String cpuType;

    public Computer(String[] boardSpecs, int memorySize, int cpuSpeed, String cpuType) {
        this.boardSpecs = boardSpecs;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
    }

    public void turnON(){
        System.out.println("Computer is turned ON");
    }
    public void turnOFF(){
        System.out.println("Computer is turned OFF");
    }
    public void boot(){
        System.out.println("System started");
    }
}
