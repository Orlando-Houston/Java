package OoPs.Interface;

public class Dice implements Dices {
    private int numberOfFaces;
    private int biasFactor;

    public Dice(){
        this.numberOfFaces=6;
        this.biasFactor=0;
    }

    public Dice (int numberOfFaces, int biasFactor){
        this.numberOfFaces = numberOfFaces;
        this.biasFactor = biasFactor;
    }

    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    public int getBiasFactor() {
        return biasFactor;
    }

    public void setBiasFactor(int biasFactor) {
        this.biasFactor = biasFactor;
    }

    public int roll(){
        double rand = Math.random()*this.numberOfFaces+1;
        return (int) rand;
    }
    public int[] rollTwice(){
        int[] arr = new int[2];
        double rand = Math.random()*this.numberOfFaces+1;
        arr[0] = (int) rand;
        rand = Math.random()*this.numberOfFaces+1;
        arr[1]=(int) rand;
        return arr;
    }
    public int[] rollTriple(){
        int[] arr = new int[3];
        double rand = Math.random()*this.numberOfFaces+1;
        arr[0] = (int) rand;
        rand = Math.random()*this.numberOfFaces+1;
        arr[1]=(int) rand;
        rand = Math.random()*this.numberOfFaces+1;
        arr[2] = (int) rand;
        return arr;
    }
    public int biasedRoll(){
        double result = Math.random()*this.numberOfFaces+1;
        int intResult = (int) result;
        if(this.biasFactor>this.numberOfFaces){
            return intResult;
        }
        else{
            if(this.biasFactor+intResult>this.numberOfFaces){
                return this.numberOfFaces;
            }
            else{
                return this.biasFactor+intResult;
            }
        }
    }

    @Override
    public String toString() {
        return "Dice{" +
                "numberOfFaces=" + numberOfFaces +
                ", biasFactor=" + biasFactor +
                '}';
    }
}
