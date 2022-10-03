import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager(new File("H_3_1.0/weapons.csv"));
        fileManager.readFile();
        fileManager.printObjects();
        fileManager.sortObjectsByDamage();
        fileManager.printObjects();
        fileManager.sortObjectsByCombatType_DamageType_Name();
        fileManager.printObjects();
    }
}