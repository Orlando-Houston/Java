package Cours.Aug25Computer;

public class NetBook extends Laptop {
    double weight;

    public NetBook(String[] mainBoardSpecs, int memorySize, int cpuSpeed, String cpuType, double weight) {
        super(mainBoardSpecs, memorySize, cpuSpeed, cpuType);
        this.weight = weight;
    }

}
