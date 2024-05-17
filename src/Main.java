public class Main {
    public static void main(String[] args) {

        Boss strongBoss = new Boss(); // 1
        strongBoss.setBossHealth(700);
        strongBoss.setBossDamage(50);
        strongBoss.setBossDefence("Water");
        System.out.println("Damage: " + strongBoss.getBossDamage() + "\n" + "Health: " + strongBoss.getBossHealth() + "\n" + "Defence: " + strongBoss.getBossDefence());
        System.out.println("--------------------------------");

        for (int i = 0; i < createHero().length; i++) { // 2
            System.out.println("Health: " + createHero()[i].getHealth());
            System.out.println("Damage: " + createHero()[i].getDamage());
            if (createHero()[i].getPower() != null) {
                System.out.println("Power: " + createHero()[i].getPower());
            }
            System.out.println("-------------------------");
        }
    }

    public static Hero[] createHero() {
        Hero hero1 = new Hero(200, 38, "Kinetic");
        Hero hero2 = new Hero(150, 45);
        Hero hero3 = new Hero(300, 20, "Fire");
        Hero[] heroes =  {hero1, hero2, hero3};
        return  heroes;
    }
}