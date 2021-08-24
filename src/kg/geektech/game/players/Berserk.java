package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;


public class Berserk extends Hero {
    public Berserk(int health, int damage,String fullName) {
        super(health, damage,SuperAbility.SAVE_DAMAGE_AND_REVERT,fullName);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
                int danageB =RPG_Game.random.nextInt(15)+ 1 + this.getDamage();
                boss.setHealth(boss.getHealth() - danageB );
                System.out.println("Берсерк активация: "
                        + danageB);


        }
   }
