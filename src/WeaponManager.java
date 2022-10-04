import java.util.ArrayList;
import java.util.Comparator;
import java.util.Formatter;
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

    public void printInterface(List<Weapon> weapons) {
        System.out.println("Printable Methode!");
        Printable printable = weapons1 -> weapons1.forEach(System.out::println);
        printable.print(weapons);
        printSeparator();
    }

    public void printInterfaceTable(List<Weapon> weapon) {
        System.out.printf("%25s%20s%20s%20s%20s%20s%20s", "NAME\t \t", "COMBAT\t \t", "DAMAGE TYPE\t \t", "DAMAGE\t \t", "SPEED\t \t", "STRENGTH\t \t", "VALUE\t \t \n");
        weapon.stream().forEach(w -> System.out.format("%25s%20s%20s%20s%20s%20s%20s", w.getName() + "\t \t+", w.getCombatType() + "\t \t+", w.getDamageType() + "\t \t+", w.getDamage() + "\t \t+", w.getSpeed() + "\t \t+", w.getStrength() + "\t \t+", w.getValue() + "\t \t+ \n"));
        printSeparator();
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
