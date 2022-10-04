public class Weapon {
    private String name;
    private CombatType combatType;
    private DamageType damageType;
    private int damage;
    private int speed;

    private int strength;
    private int value;

    public Weapon(String name, CombatType combatType, DamageType damageType, int damage, int speed, int strength, int value) {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    public static Weapon deserialize(String line){
        String[] parts = line.split(";");
        String weaponName = parts[0];
        CombatType weaponCombatType = CombatType.valueOf(parts[1]);
        DamageType weaponDamageType = DamageType.valueOf(parts[2]);
        int weaponDamage = Integer.parseInt(parts[3]);
        int weaponSpeed = Integer.parseInt(parts[4]);
        int weaponStrength = Integer.parseInt(parts[5]);
        int weaponValue = Integer.parseInt(parts[6]);
        return new Weapon(weaponName, weaponCombatType, weaponDamageType, weaponDamage, weaponSpeed, weaponStrength, weaponValue);
    }

    @Override
    public String toString(){
        return name + ": " + " Combat: " + combatType + " Damage Type: " + damageType + " Damage: " + damage + " Speed: " + speed + " Strength: " + strength + " Value: " + value + "pt.";
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

    public int getStrength() {
        return strength;
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
