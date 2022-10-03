public class Weapon {
    private String name;
    private CombatType combatType;
    private DamageType damageType;
    private int damage;
    private int speed;
    private int value;

    public Weapon(String name, CombatType combatType, DamageType damageType, int damage, int speed, int value) {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCombatType(CombatType combatType) {
        this.combatType = combatType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
