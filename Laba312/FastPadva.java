package laba3;

public class FastPadva extends Monster{

    FastPadva(int power, int damage, int health) {
        super(power, damage, health);
    }

    @Override
    public void movement() {
        System.out.println("Монстр быстро бегает и уворачивается");
    }

    @Override
    public void abilities() {
        System.out.println("Способности Монстра:");
        System.out.println("Бъет руками");
        System.out.println("Бъет ногами");
        System.out.println("Бъет руками и ногами");
    }

    @Override
    public void attack() {
        int b = (int)(Math.random() * 3) + 1;
       switch(b){
        case 1:
        if(this.getPower() >= 10){
            System.out.println("Бъет руками");
            this.setPower(this.getPower() - 10);
            this.setDamage(20);
            }
            else
            {
                System.out.println("Недостаточно сил");
            }
        break;
        case 2:
        if(this.getPower() >= 15){
            System.out.println("Бъет ногами");
            this.setPower(this.getPower() - 15);
            this.setDamage(25);
            }
            else
            {
                System.out.println("Недостаточно сил");
            }
        break;
        case 3:
        if(this.getPower() >= 20){
            System.out.println("Бъет руками и ногами");
            this.setPower(this.getPower() - 20);
            this.setDamage(20);
            }
            else
            {
                System.out.println("Недостаточно сил");
            }
        break;
       }
    }

    @Override
    public void attacked(int getAttaked) {
        if(this.getHealth() > getAttaked){
            this.setHealth(this.getHealth() - getAttaked); 
             System.out.println("Оставшиеся HP" + this.getHealth());
           }
           else{
            this.setHealth(this.getHealth() - getAttaked); 
            System.out.println("Монстр был повержен. Ты дошёл до Босса монстров!!!");
           }
        
        }
        

    @Override
    public void print() {
        System.out.println("Оставшиеся HP: " + super.getHealth());
        System.out.println("Оставшаяся сила: " + super.getPower());
        System.out.println("Базовый урон: " + this.getDamage());
    }
    
}
