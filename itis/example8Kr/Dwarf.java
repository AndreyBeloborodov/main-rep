package itis.example8Kr;

public class Dwarf extends Creature
                        implements IMiner {

    Dwarf(String name) {
        super(name, 150);
    }

    void upgrade(Creature friend) {
        friend.level++;
        System.out.println(name + " upgrades " + friend.name + " to " + friend.level);
    }

    public void mine() {
        System.out.println(name + " digs");
    }

}
