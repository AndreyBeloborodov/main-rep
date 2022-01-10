package itis.example8Kr;

public class Main {
    public static void main(String[] args) {
        Dwarf D = new Dwarf("Tanuhin");
        Elf E = new Elf("Ksuhin");
        Human H = new Human("Andruhin");
        D.attack(E);
        E.attack(D);
        H.attack(E);
        H.attack(D);
        H.reproduce();
        D.upgrade(H);
        D.upgrade(H);
        H.attack(E);
    }
}
