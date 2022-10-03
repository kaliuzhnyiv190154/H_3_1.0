import java.util.ArrayList;

public class WeaponManager {
    private final ArrayList<Weapon> weapons = new ArrayList<>();

    public WeaponManager() {

    }

    public void printWeapons(){
        weapons.forEach(System.out::println);
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    public void removeWeapon(Weapon weapon){
        weapons.remove(weapon);
    }
}
