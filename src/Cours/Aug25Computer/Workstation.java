package Cours.Aug25Computer;

public class Workstation  extends Computer implements Computers{
    String housingType;
    int screenSize;

    public Workstation(String[] boardSpecs, int memorySize, int cpuSpeed, String cpuType, String housingType, int screenSize) {
        super(boardSpecs, memorySize, cpuSpeed, cpuType);
        this.housingType = housingType;
        this.screenSize = screenSize;
    }

    public void setMainBoard(){
        System.out.println("Mainboard is set");
    }
    public void installCPU(){
        System.out.println("CPU is installed");
    }
    public void installMemory(){
        System.out.println("Memory is installed ");
    }
}
