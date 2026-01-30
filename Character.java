public class Character {
    private int health,stamina;
    private final int maxHealth,maxStamina;

    Character(int health,int stamina){
        this.maxHealth=health;
        this.maxStamina=stamina;
        this.health=health;
        this.stamina=stamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    public int getHealth() {return health;}
    public int getStamina() {return stamina;}

    public void swingSword(){
        if(stamina==0||stamina<10){
            System.out.println("Your character needs to cool down.");
        }
        else {
            this.stamina-=10;
            System.out.println("Character swings the sword. Stamina is now "+stamina);
        }
    }

    public void takeDamage(int damage){
        int hp = this.health-=damage;
        if(hp<=0){
            this.health = 0;
            System.out.println("Character takes " + damage +" damage. Health is now "+health);
            System.out.println("Character is dead.");
        }
        else {
            System.out.println("Character takes " + damage +" damage. Health is now "+hp);
        }

    }

    public void rest(){
        this.stamina=maxStamina;
        this.health=maxHealth;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
        System.out.println("Character's health: "+maxHealth+", stamina: "+maxStamina);
    }

    public void show(){
        System.out.println("Character's health: "+this.health+", stamina: "+this.stamina);
    }

}
