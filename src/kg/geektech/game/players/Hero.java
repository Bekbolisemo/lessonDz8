package kg.geektech.game.players;

public abstract class Hero extends GameEntity
        implements HavingSuperAbility {
    private SuperAbility superAbility;

    public Hero(int health, int damage, SuperAbility superAbility , String fullName) {
        super(health, damage, fullName);
        this.superAbility = superAbility;
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }
}
