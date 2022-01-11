package itis.example8Kr;

public class Creature {

    String name;
    int level;
    int hp;

    Creature(String name, int hp) {
        this.name = name;
        this.hp = hp;
        level = 1;
    }

    void attack(Creature other) {
        other.hp = Math.max(0, other.hp - level);
        System.out.println(name + " attacks " + other.name + ": " + other.hp + " left");
    }

}
