package laba3;

import java.util.Scanner;

interface Iobject{
   abstract public void print();
}

interface IPersonag {
    abstract public void movement();
    abstract public void attack();
    abstract public void attacked(int getAttaked);
 }

 abstract class Monster implements Iobject, IPersonag{
   private int power;
   private int damage;
   private int health;
  
   Monster(int power,int damage,int health){
    this.power = power;
    this.damage = damage;
    this.health = health;
   }
   
   public int getPower(){
       return power;
   }
   public int getDamage(){
    return damage;
   }
   public int getHealth(){
    return health;
   }
   public void setPower(int power){
    this.power = power;
   }
   public void setHealth(int health){
    this.health = health;
   }
   public void setDamage(int damage){
    this.damage = damage;
   }
   abstract public void abilities();
 }
public class laba3 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        BossOfTheGym BOG  = new BossOfTheGym(200, 30, 200);
        FastPadva FP = new FastPadva(100, 15, 100);
        Magician M = new Magician(100, 100, 10);
        Warrior W = new Warrior(100, 100, 10);
        System.out.println("Выбери персонажа за которого будешь играть 1: Воин или 2: Маг");
        int b = a.nextInt();
        switch(b){
            case 1:
            System.out.println("Поздравляю с выбором персонажа, вот его характеристики:");
            W.print();
            System.out.println("Теперь неообходимо добраться до монстра, чтобы одолеть его и спасти принцессу");
            W.movement();
            System.out.println("Дальше тебе предстоит сразиться с монстром, вот его характеристики и способности:");
            FP.print();
            FP.abilities();
                while(true){
                int rand = (int)(Math.random() * 100) + 1;
                System.out.println("Нажми 1 для атаки:");
                int с = a.nextInt();
                if(rand % 2 == 0){ 
                    W.attack();
                    FP.attacked(W.getDamage());
                    if(FP.getHealth()<=0||W.getHealth()<=0){
                     break;
                    }
                }
                else{
                        FP.movement();
                } 
                int srand = (int)(Math.random() * 100) + 1;
                        System.out.println("Монстр атакует тебя:");
                        if(srand % 2 == 0){ 
                            FP.attack();
                            W.attacked(FP.getDamage());
                            if(W.getHealth()<=0){
                                break;
                            }
                        }else{W.movement();}
            }
            System.out.println("После боя твои характеристики равны: ");
            W.print();
           System.out.println("Поздравляю, ты всего в шаге от освобождения принцессы. Осталось победить Босса монстров и принцесса как следует отсблагодарит тебя!)");
           System.out.println("Вот его характеристики и способности:");
           BOG.print();
           BOG.abilities();
           while(true){
            int rand = (int)(Math.random() * 100) + 1;
                System.out.println("Нажми 1 для атаки:");
                int m = a.nextInt();
                if(rand % 2 == 0){ 
                    W.attack();
                    BOG.attacked(W.getDamage());
                    if(BOG.getHealth()<=0 || W.getHealth()<=0){
                     break;
                    }
                }
                else{
                        BOG.movement();
                } 
                int srand = (int)(Math.random() * 100) + 1;
                        System.out.println("Монстр атакует тебя:");
                        if(srand % 2 == 0){ 
                           
                            BOG.attack();
                            W.attacked(BOG.getDamage());
                            if(W.getHealth()<=0){
                                break;
                            }
                        }else{W.movement();}
           }
            break;
            case 2:
            System.out.println("Поздравляю с выбором персонажа, вот его характеристики:");
            M.print();
            System.out.println("Теперь неообходимо добраться до монстра, чтобы одолеть его и спасти принцессу");
            M.movement();
            System.out.println("Дальше тебе предстоит сразиться с монстром, вот его характеристики и способности:");
            FP.print();
            FP.abilities();
            while(true){
                int rand = (int)(Math.random() * 100) + 1;
                System.out.println("Нажми 1 для атаки:");
                int с = a.nextInt();
                if(rand % 2 == 0){ 
                    M.attack();
                    FP.attacked(M.getDamage());
                    if(FP.getHealth()<=0 ||M.getHealth()<=0){
                     break;
                    }
                }
                else{
                        FP.movement();
                }
                int srand = (int)(Math.random() * 100) + 1;
                        System.out.println("Монстр атакует тебя:");
                        if(srand % 2 == 0){ 
                            FP.attack();
                            M.attacked(FP.getDamage());
                            if(M.getHealth()<=0){
                                break;
                            }
                        }else{M.movement();} 
            }
            System.out.println("После боя твои характеристики равны: ");
            M.print();
           System.out.println("Поздравляю, ты всего в шаге от освобождения принцессы. Осталось победить Босса монстров и принцесса как следует отсблагодарит тебя!)");
           System.out.println("Вот его характеристики и способности:");
            BOG.print();
            BOG.abilities();
           while(true){
            int rand = (int)(Math.random() * 100) + 1;
                System.out.println("Нажми 1 для атаки:");
                int m = a.nextInt();
                if(rand % 2 == 0){ 
                    M.attack();
                    BOG.attacked(M.getDamage());
                    if(BOG.getHealth() <= 0 || M.getHealth() <= 0){
                     break;
                    }
                }
                else{
                        BOG.movement();
                } 
                int srand = (int)(Math.random() * 100) + 1;
                System.out.println("Монстр атакует тебя:");
                if(srand % 2 == 0){ 
                    BOG.attack();
                    M.attacked(BOG.getDamage());
                    if(M.getHealth()<=0){
                        break;
                    }
                }else{M.movement();}
           }
            break;
            
        }
    }
}
