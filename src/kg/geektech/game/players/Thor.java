package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{

    public Thor(int health, int damage,String fullName )
    {
        super(health, damage, SuperAbility.FREEZING,fullName);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        switch (RPG_Game.random.nextInt(3)+1){
            case 1:
                boss.setDamage(boss.getDamage() - boss.getDamage());
                System.out.println("Бос оглушен!!");
                break;
            case 2:
                boss.setDamage(50);
                break;
            case 3:
                boss.setDamage(50);
                break;
        }
    }
}
