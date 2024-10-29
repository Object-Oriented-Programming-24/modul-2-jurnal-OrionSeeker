// Class Hero ini mewarisi class abstract Character dan mengimplementasikan interface Behaviour
public class Hero extends Character implements Behaviour{
    // Variabel count ini saya gunakan untuk menghitung berapa kali spesial skill pernah digunakan oleh salah satu objek Hero. Modifier private, diakses dari class lain dengan setter dan getter.
    private int count;

    // Method ini adalah constructor dari class Hero, constructor ini hanya memanggil constructor dari superclass, yaitu class Character.
    public Hero(String name, int health, int attack){
        super(name, health, attack);
    }

    // Method attack ini adalah method yang digunakan untuk attack villain. Parameter tipenya Character agar kompatibel dengan Villain dan Hero (method ini dipanggil di spesialSkill).
    // Jadi di sini memanfaatkan bilangan random yang digenerate, jika bil random modulo 4 bukan 0 (modulo 4 memungkinkan angka 0,1,2,3), maka probabilitas 75% akan terkena hit.
    // Jika angka yang dirandom dimodulo 4 itu 0, berarti attack didodge.
    public void attack(Character a, int random){
        System.out.println("You attack " + a.getName() + " with normal attack!");
        if(random%4!=0){
            a.setHealth(a.getHealth() - getAttack());
        }
        else{
            System.out.println(a.getName() + " dodge your attack");
        }
    }

    // Method showCharacter ini digunakan untuk menampilkan nama hero, health hero, dan attack dari hero. Method ini sebenarnya adalah overriding dari method yang ada di class Character.
    public void showCharacter(){
        System.out.println("Hero: " + getName() + " | Health: " + getHealth() + " | Attack: " + getAttack());
    }

    // Method dead ini digunakan untuk memberi tahu bahwa hero berhasil dikalahkan, jadi villain menang. Method ini adalah overriding dari method di interface Behaviour. 
    // Parameternya di sini Character karena method yang dioverride harus sama parameternya dengan induk, jadi agar bisa masuk tipe data Villain ataupun Hero, digunakan Character.
    public void dead(Character a){
        System.out.println("Villain wins, " + getName() + " lost in battle!");
    }

    // Method setCount ini adalah setter untuk atribut count agar bisa diakses dari kelas lain.
    public void setCount(int count){
        this.count = count;
    }

    // Method getCount ini adalah getter untuk atribut count agar bisa diakses dari kelas lain.
    public int getCount(){
        return this.count;
    }

    // Method spesialSkill ini adalah method yang digunakan untuk melakukan spesialskill, yaitu antara regenerasi atau double attack. Di sini antara regeneration dan
    // double damage memiliki probabilitas 50%. Jika bil random%2 hasilnya 0, maka regenerasi (tambah 30 ke health), jika hasil bil random%2 adalah 1, maka double damage
    // (damage menjadi 30). Double damage di sini masih ada kemungkinan dihindari atau didodge. Jika bil random%4 bukanlah 1, maka attack gagal didodge, jika 1 maka berhasil didodge.
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
                System.out.println(a.getName() + " dodge your attack");
            }
            setAttack(15);
        }
    }
}
