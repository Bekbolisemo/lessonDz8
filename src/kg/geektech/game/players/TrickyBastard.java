package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class TrickyBastard extends Hero {

    public TrickyBastard(int health, int damage, String fullName ) {
        super(health, damage, SuperAbility.PRETEND_TO_BE_DEAD,fullName);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        switch (RPG_Game.random.nextInt(3)+1){
            case 1:
                this.setHealth(0);
                System.out.println("TrickyBastard претворился мертвым");
                break;
            case 2:
                this.setHealth( this.getHealth() +0);
                break;
            case 3:
                this.setHealth( this.getHealth() + 0);
                break;
        }

    }
}
