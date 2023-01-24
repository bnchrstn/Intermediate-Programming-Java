public class Character {
    
    int strenght;
    int intelligence;
    int agility;
    String name;

    Account account; 

    Weapon characterWeapon;

    Character (int characterStrenght, int chracterIntelligence, int characterAgility, String characterName, Account playerName) {
        this.strenght = characterStrenght;
        this.intelligence = chracterIntelligence;
        this.agility = characterAgility;
        this.name = characterName;
        this.account = playerName;
    }

    void sayOwnerName() {
        System.out.println("This " + name + " character is owned by " + account.name);
    }

    void giveWeapon(Weapon weaponName) {
        System.out.println(name + " now owns a " + weaponName.name + " and it deals " + weaponName.damage + "% true damage" );
    }

}
