package itis.example8Kr;

public class Human extends Creature {

    Human(String name) {
        super(name, 100);
    }

    Human(String name, int hp, int level) {
        super(name, hp);
        this.level = level;
    }

    void reproduce() {
        level /= 2;
        Human link = new Human("son_" + name, hp, level);
        System.out.println(name + " gives birch to " + link.name + ": " + link.hp);
    }

    @Override
    public void ride() {
        System.out.println(name + " ride");
    }

    @Override
    public void mine() {
        System.out.println(name + " digs");
    }
}
