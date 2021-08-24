package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;


public class Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage,
                SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        switch (RPG_Game.random.nextInt(3)+1) {

            case 1 :
                this.setDamage( this.getDamage() + RPG_Game.random.nextInt(15) + 1  );
                System.out.println("Берсерк октевировал супер спасобность ");
                break;

            case 2 :
                heroes[3].setDamage(10);
                break;
            case 3 :
                heroes[3].setDamage(10);
                break;

        }


        }
   }
