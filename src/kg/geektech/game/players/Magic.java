package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage,String fullName) {
        super(health, damage, SuperAbility.BOOST,fullName);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            switch (RPG_Game.random.nextInt(3) + 1) {
                case 1:
                    heroes[i].setDamage(getDamage() + RPG_Game.random.nextInt(5) + 2);
                    System.out.println("Медик использовал супер спасобность");
                    break;

                case 2:
                    heroes[i].setDamage(getDamage() + 0);
                    break;
                case 3:
                    heroes[i].setDamage(getDamage() + 0);
                    break;
            }
            break;

        }
    }
}
