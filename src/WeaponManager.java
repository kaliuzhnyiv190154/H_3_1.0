import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        System.out.println("Not Printable Methode!");
        weapons.forEach(System.out::println);
        printSeparator();
    }

    public void printInterface(List<Weapon> weapons){
        System.out.println("Printable Methode!");
        Printable printable = weapons1 -> weapons1.forEach(System.out::println);
        printable.print(weapons);
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
