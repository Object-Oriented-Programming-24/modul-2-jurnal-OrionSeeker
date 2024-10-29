public class Villain extends Character implements Behaviour{
    private int count;

    public Villain(String name, int health, int attack){
        super(name, health, attack);
    }

    public void attack(Character a, int random){
        System.out.println(getName() + " attack you with normal attack!");
        if(random%4!=0){
            a.setHealth(a.getHealth() - getAttack());
        }
        else{
            System.out.println("You dodge " + a.getName() + " attack");
        }
    }

    public void showCharacter(){
        System.out.println("Villain: " + getName() + " | Health: " + getHealth() + " | Attack: " + getAttack());
    }

    public void dead(Character a){
        System.out.println("Hero wins!!! " + a.getName() + " lost in battle!");
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getCount(){
        return this.count;
    }

    public void spesialSkill(Character a, int random){
        System.out.print(getName() + " used special skill, ");
        if(random%2==0){
            System.out.println("Regeneration!!");
            setHealth(getHealth() + 30);
        }
        else{
            System.out.println("Double Damage!");
            setAttack(30);
            if(random%4!=1){
                a.setHealth(a.getHealth() - getAttack());
            }
            else{
                System.out.println("You dodge " + a.getName() + " attack");
            }
            setAttack(15);
        }
    }
}
