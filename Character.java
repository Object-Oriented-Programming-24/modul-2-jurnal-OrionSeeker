public abstract class Character{
    private String name;
    private int health;
    private int attack;

    public void setName(String name){
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
    public int getAttack(){
        return this.attack;
    }

    public abstract void showCharacter();

    public Character(String name, int health, int attack){
        this.name = name;
        this.health = health;
        this.attack = attack;
    }
}