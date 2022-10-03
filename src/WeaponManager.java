import java.util.ArrayList;
import java.util.Comparator;

public class WeaponManager {
    private final ArrayList<Weapon> weapons = new ArrayList<>();

    public WeaponManager() {

    }

    public void sortWeaponsByDamage() {
        weapons.sort((Weapon w1, Weapon w2) -> w2.getDamage() - w1.getDamage());
    }

    public void sortWeaponsByCombatType_DamageType_Name() {
        weapons.sort(Comparator.comparing(Weapon::getCombatType)
                .thenComparing(Weapon::getDamageType)
                .thenComparing(Weapon::getName));
    }

    public void printWeapons() {
        weapons.forEach(System.out::println);
        printSeparator();
    }

    public void printSeparator() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public void removeWeapon(Weapon weapon) {
        weapons.remove(weapon);
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
