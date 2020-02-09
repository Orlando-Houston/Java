package Oracle;

public class O76ConstrProduct {
    int id;
    String name;
    public O76ConstrProduct(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        O76ConstrProduct p1=new O76ConstrProduct (101,"Pen");
        O76ConstrProduct p2=new O76ConstrProduct (101,"Pen");
        O76ConstrProduct p3=p1;

        boolean ans1=p1==p2;

        boolean ans2=p1.name.equals (p2.name);
        System.out.println (ans1+":"+ans2);
    }
}
//referance different  but content same equals= c0ntent      ==referans
