public class App {
    public static void main(String[] args) throws Exception {

        Account player1 = new Account("Ben Aceveda");
        
        Character wizard = new Character(8, 10, 8, "Invoker", player1);

        wizard.sayOwnerName();

        Weapon fireball = new Weapon();
        fireball.name = "katon";
        fireball.damage = 69;

        wizard.giveWeapon(fireball);

    }
}
