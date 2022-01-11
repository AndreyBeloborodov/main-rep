package itis.example9_pozdnee_svyzivanie;

public class Contract {
    public String name;
    public int point;

    Contract(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public void printName() {
        System.out.print(name);
    }

    public void printPoint() {
        System.out.print(point);
    }
}
