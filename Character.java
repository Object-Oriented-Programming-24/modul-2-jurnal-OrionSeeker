// Class ini adalah class abstract bernama Character yang akan diturunkan atribut dan methodnya ke class class Hero dan Villain
public abstract class Character{
    // Atribut name, health, dan attack modifernya private, jadi perlu setter dan getter jika mau diakses dari class lain
    private String name;
    private int health;
    private int attack;

    // Method setName ini adalah setter yang digunakan untuk mengatur nilai atribut name dari class lain.
    public void setName(String name){
        this.name = name;
    }
    // Method setHealth ini adalah setter yang digunakan untuk mengatur nilai atribut health dari class lain.
    public void setHealth(int health){
        this.health = health;
    }
    // Method setAttack ini adalah setter yang digunakan untuk mengatur nilai atribut attack dari class lain.
    public void setAttack(int attack){
        this.attack = attack;
    }
    // Method getName ini adalah getter yang digunakan untuk mengambil nilai atribut name dari class lain.
    public String getName(){
        return this.name;
    }
    // Method getHealth ini adalah getter yang digunakan untuk mengambil nilai atribut health dari class lain.
    public int getHealth(){
        return this.health;
    }
    // Method getAttack ini adalah getter yang digunakan untuk mengambil nilai atribut attack dari class lain.
    public int getAttack(){
        return this.attack;
    }

    // Method showCharacter ini adalah method yang bersifat abstrak, yang isinya akan didefinisikan masing-masing di kelas anak.
    public abstract void showCharacter();

    // Method ini adalah constructor dari class Character, jadi nilai dari name, health, dan attack akan diatur berdasarkan argumen yang dimasukkan dalam fungsi ini ketika membuat objek Character.
    public Character(String name, int health, int attack){
        this.name = name;
        this.health = health;
        this.attack = attack;
    }
}