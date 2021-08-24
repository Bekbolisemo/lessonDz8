package kg.geektech.game.players;

public abstract class GameEntity {
     private int health;
     private int damage;
     private String fullName;


    public GameEntity(int health, int damage, String fullName) {
        this.health = health;
        this.damage = damage;
        this.fullName = fullName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
