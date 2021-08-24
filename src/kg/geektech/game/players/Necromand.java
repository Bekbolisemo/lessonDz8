package kg.geektech.game.players;

public class Necromand extends Hero {

    private int necroEnergy;

    public Necromand(int health, int damage, int necroEnergy, String fullName) {
        super(health, damage, SuperAbility.UNDEAD, fullName);
        this.necroEnergy = necroEnergy;

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0) {
                if (this != heroes[i]) {
                        heroes[i].setHealth(heroes[i].getHealth() + necroEnergy);
                    heroes[i].setDamage(10);
                    heroes[i].setFullName("Нишая Нежить");
                    System.out.println("Востание мертвых");
                    }
                }
            }

        }
    }

