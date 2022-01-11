package itis.example9_pozdnee_svyzivanie;

public class ContractCP extends Contract {

    ContractCP(String name, int point) {
        super(name, point);
    }

    public void printName() {
        super.printName();
        System.out.println("_CP");
    }

    public void printPoint() {
        super.printPoint();
        System.out.println("_CP");
    }
}
