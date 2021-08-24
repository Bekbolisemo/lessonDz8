package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Antman extends Hero{


    public Antman(int health, int damage,String fullName) {
        super(health, damage, SuperAbility.CHANGE_IN_BODY_SIZE,fullName);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        switch (RPG_Game.random.nextInt(2)+1){
            case 1:
                if (boss.getDamage() > 0){
                    this.setDamage(getDamage() + 10);
                    this.setHealth(getHealth() + 50);
                    System.out.println("Antman увиличелся на " + RPG_Game.random.nextInt(5)+1 + " метр");
                    break;
                }
                break;
            case 2:
                this.setDamage(getDamage() - 5 );
                this.setHealth(getHealth() -100);
                System.out.println("Atman уменьшился на " + RPG_Game.random.nextInt(5)+1 + " сантиметр");
                break;


        }
    }
}
