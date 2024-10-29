// Class ini digunakan untuk membuat randomizer atau generator angka random
public class Random {
    // Seed ini nantinya akan diisi System time dalam milisecond
    private long seed;

    // Ini adalah constructor yang digunakan untuk menset atribut seed ketika objek Random dibuat
    public Random(long s){
        this.seed = s;
    }

    // Method generateRandomNum digunakan untuk mengenerate angka random menggunakan algoritma LCG (Linear congruential generator).
    // Seed dikalikan 16807 karena di beberapa penelitian sudah diuji sebagai multiplier terbaik (faktor primitif dari modulus 2147483647).
    // Angka 2147483647 didapatkan dari bilangan prima terbesar 32 bit (2^31 minus 1). Untuk mencegah overflow int 32 bit
    public int generateRandomNum(){
        seed = (seed * 16807)%2147483647;
        return (int) seed;
    }
}
