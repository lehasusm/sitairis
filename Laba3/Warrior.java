package laba3;

public class Warrior implements Iobject, IPersonag {

    private int health;
    private int power;
    private int damage;
    Warrior(int health, int power, int damage){
    this.health = health;
    this.power = power;
    this.damage = damage;
    }
    public int getDamage(){
        return damage;
       }
       public int getHealth(){
        return health;
       }
    @Override
    public void movement() {
        System.out.println("Ты скачешь на лошади");
    }

    @Override
    public void attack() {
        if(this.power >= 10){
        power -= 10;
        damage += 15;
        System.out.println("Атакует копьем на "+ damage +"HP");
        }
        else
        {
            System.out.println("Недостаточно маны");
        }
    }

    @Override
    public void attacked(int getAttaked) {
        if(health > getAttaked){
            health -= getAttaked; 
             System.out.println("Оставшиеся HP" + health);
           }
           else{
            health -= getAttaked; 
            System.out.println("Воин пал, храбро сражаясь, против монстра");
           }
    }

    @Override
    public void print() {
        System.out.println("Оставшиеся HP: " + health);
        System.out.println("Оставшаяся сила: " + power);
        System.out.println("Базовый урон: " + damage);
    }
    
}
