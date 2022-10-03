import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WeaponManager {
    private final ArrayList<Weapon> weapons = new ArrayList<>();

    public WeaponManager() {

    }

    public void sortWeaponsByDamage() {
        weapons.sort(new Comparator<Weapon>() {
            @Override
            public int compare(Weapon o1, Weapon o2) {
                return o2.getDamage() - o1.getDamage();
            }
        });
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
}
