import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponManagerTest {

    @org.junit.Test
    public void sortWeaponsByDamage() {
        WeaponManager result = new WeaponManager();
        result.addWeapon(new Weapon("Sword", CombatType.MELEE, DamageType.SLASHING, 100, 20, 40, 4500));
        result.addWeapon(new Weapon("Crossbow", CombatType.RANGED, DamageType.PIERCING, 130, 10, 60, 4300));
        result.addWeapon(new Weapon("Knife", CombatType.MELEE, DamageType.SLASHING, 60, 50, 20, 3000));
        result.sortWeaponsByDamage();
        String resultString = result.getWeapons().get(0).toString() + result.getWeapons().get(1).toString() + result.getWeapons().get(2).toString();

        WeaponManager expResult = new WeaponManager();
        expResult.addWeapon(new Weapon("Crossbow", CombatType.RANGED, DamageType.PIERCING, 130, 10, 60, 4300));
        expResult.addWeapon(new Weapon("Sword", CombatType.MELEE, DamageType.SLASHING, 100, 20, 40, 4500));
        expResult.addWeapon(new Weapon("Knife", CombatType.MELEE, DamageType.SLASHING, 60, 50, 20, 3000));
        String expResultString = expResult.getWeapons().get(0).toString() + expResult.getWeapons().get(1).toString() + expResult.getWeapons().get(2).toString();

        assertEquals(expResultString, resultString);
    }

    @Test
    public void sortWeaponsByCombatType_DamageType_Name() {
        WeaponManager result = new WeaponManager();
        result.addWeapon(new Weapon("Sword", CombatType.MELEE, DamageType.SLASHING, 100, 20, 40, 4500));
        result.addWeapon(new Weapon("Crossbow", CombatType.RANGED, DamageType.PIERCING, 130, 10, 60, 4300));
        result.addWeapon(new Weapon("Knife", CombatType.MELEE, DamageType.SLASHING, 60, 50, 20, 3000));
        result.sortWeaponsByCombatType_DamageType_Name();
        String resultString = result.getWeapons().get(0).toString() + result.getWeapons().get(1).toString() + result.getWeapons().get(2).toString();

        WeaponManager expResult = new WeaponManager();
        expResult.addWeapon(new Weapon("Knife", CombatType.MELEE, DamageType.SLASHING, 60, 50, 20, 3000));
        expResult.addWeapon(new Weapon("Sword", CombatType.MELEE, DamageType.SLASHING, 100, 20, 40, 4500));
        expResult.addWeapon(new Weapon("Crossbow", CombatType.RANGED, DamageType.PIERCING, 130, 10, 60, 4300));
        String expResultString = expResult.getWeapons().get(0).toString() + expResult.getWeapons().get(1).toString() + expResult.getWeapons().get(2).toString();

        assertEquals(expResultString, resultString);
    }
}