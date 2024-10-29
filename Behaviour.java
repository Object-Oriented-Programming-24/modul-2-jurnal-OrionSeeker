// Interface Behaviour ini nantinya akan diimplementasikan oleh class Hero dan class Villain
public interface Behaviour {
    // Method spesialSkill ini akan didefinisikan isinya di class Hero dan Villain. Parameternya Character a karena Hero dan Villain adalah anak dari Character.
    // Karena anak dari Character, maka akan kompatibel jika diisi yang bertipe data Hero atau Villain. int random adalah angka random yang digenerate randomizer.
    public void spesialSkill(Character a, int random);
    // Method dead ini akan didefinisikan di class Hero dan Villain. Parameter Character a karena Hero dan Villain anak dari Character, sehingga akan kompatibel
    // jika diisi tipe data Hero atau Villain.
    public void dead(Character a);
}
