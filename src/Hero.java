public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String power;

    public Hero(int heroesHealth, int heroesDamage, String power){
//        System.out.println("Constructor 1");
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.power = power;

    }
    public Hero(int heroesHealth, int heroesDamage){
//        System.out.println("Constructor 2");
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public int getHealth(){
        return  this.heroesHealth;
    }
    public  int getDamage(){
        return this.heroesDamage;
    }
    public String getPower(){
        return this.power;
    }
}
