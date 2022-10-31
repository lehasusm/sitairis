package laba3;

public class Magician implements Iobject, IPersonag {
    private int health;
    private int mana;
    private int damage;
    Magician(int health, int mana,int  damage){
    this.health = health;
    this.mana = mana;
    this.damage = damage;
    }
    public int getMana(){
        return mana;
    }
    public int getDamage(){
     return damage;
    }
    public int getHealth(){
     return health;
    }
    @Override
    public void movement() {
        System.out.println("Ты летишь");
    }

    @Override
    public void attack() {
        if(this.mana >= 10){
        mana -= 10;
        damage += 15;
        System.out.println("Кидает fireball на"+ damage +"HP");
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
        System.out.println("Маг пал, храбро сражаясь, против монстра");
       }
    }
     
    @Override
    public void print() {
        System.out.println("Оставшиеся HP: " + health);
        System.out.println("Оставшаяся мана: " + mana);
        System.out.println("Базовый урон: " + damage);
    }
 
    
}
