import java.util.ArrayList;
import java.util.Comparator;
import java.util.Formatter;
import java.util.List;

public class WeaponManager {
    private final ArrayList<Weapon> weapons = new ArrayList<>();
    private String separator;

    public WeaponManager() {
        separator = "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";

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

    public void printInterface(List<Weapon> weapons) {
        System.out.println("Printable Methode!");
        Printable printable = weapons1 -> weapons1.forEach(System.out::println);
        printable.print(weapons);
        printSeparator();
    }

    public void printInterfaceTable(List<Weapon> weapon) {
        System.out.printf("%22s%21s%20s%20s%20s%20s%20s", "NAME\t \t \t", "COMBAT\t \t \t", "DAMAGE TYPE\t \t \t", "DAMAGE\t \t \t", "SPEED\t \t \t", "STRENGTH\t \t \t", "VALUE\t \t \t \n");
        printSeparator();
        weapon.forEach(w -> System.out.format("%25s%20s%20s%20s%20s%20s%20s", w.getName() + "\t \t \t |", w.getCombatType() + "\t \t \t |", w.getDamageType() + "\t \t \t|", w.getDamage() + "pt. \t \t \t|", w.getSpeed() + "pt. \t \t \t|", w.getStrength() + "pt. \t \t \t|", "\t \t" + w.getValue() + "pt. \t | \n" + separator + "\n"));
    }

    public void printSeparator() {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
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
