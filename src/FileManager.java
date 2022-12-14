import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileManager {
    private File file;
    private final WeaponManager weaponManager;

    public FileManager(File file) {
        this.file = file;
        weaponManager = new WeaponManager();
    }

    public void printObjectsInterface() {
        weaponManager.printInterface(weaponManager.getWeapons());
    }

    public void printObjectsInterfaceTable(){
        weaponManager.printInterfaceTable(weaponManager.getWeapons());
    }

    public void printObjects() {
        weaponManager.printWeapons();
    }

    public void sortObjectsByDamage() {
        weaponManager.sortWeaponsByDamage();
    }

    public void sortObjectsByCombatType_DamageType_Name() {
        weaponManager.sortWeaponsByCombatType_DamageType_Name();
    }

    public void readFile() {
        try (Stream<String> stream = Files.lines(Paths.get(file.getPath()))) {

            stream.skip(1).forEach(line -> weaponManager.addWeapon(Weapon.deserialize(line)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
