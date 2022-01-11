package itis.example8Kr;

public class Elf extends Creature
                    implements IRider {

    Elf(String name) {
        super(name, 250);
    }

    void heal() {
        hp += level;
        System.out.println(name + " heals self: " + hp);
    }

    void heal(Creature friend) {
        friend.hp += level;
        System.out.println(name + " heals " + friend.name + ": " + friend.hp);
    }

    @Override
    public void ride() {
        System.out.println(name + " ride");
    }
}
