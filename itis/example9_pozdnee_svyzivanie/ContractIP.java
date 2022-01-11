package itis.example9_pozdnee_svyzivanie;

public class ContractIP extends Contract {

    ContractIP(String name, int point) {
        super(name, point);
    }

    public void printName() {
        super.printName();
        System.out.println("_IP");
    }

    public void printPoint() {
        super.printPoint();
        System.out.println("_IP");
    }

}
