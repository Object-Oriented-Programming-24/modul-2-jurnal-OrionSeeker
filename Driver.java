public class Driver {
    // Method main ini adalah tempat kita menginitialisasi objek.
    public static void main(String[] args) {
        // Initialisasi objek Hero bernama asad dan objek Villain bernama zhafran, masing masing dengan atribut name, health, dan attack.
        Hero asad = new Hero("As'ad Sakai", 100, 15);
        Villain zhafran = new Villain("Zhafran Khan", 100, 15);

        // Membuat randomizer dengan seed awal waktu System dalam milimeter.
        Random randomizer = new Random(System.currentTimeMillis());

        // Menampilkan nama, health, dan attack dari asad dan zhafran
        asad.showCharacter();
        zhafran.showCharacter();
        System.out.println();

        // looping battle sampai salah satu antar asad atau zhafran healthnya di bawah 0
        while(asad.getHealth() >= 0 && zhafran.getHealth()>=0){
            // Membuat angka random menggunakan randomizer yang telah dibuat sebelumnya
            int angkaRandom = randomizer.generateRandomNum();
            // Jika health asad di bawah 50, memungkinkan untuk melakukan spesialskill
            if(asad.getHealth()<50){
                // angkaRandom%4==0 artinya 25% kemungkinan dan hanya bisa melakukan spesialskill 1x dilihat dari count
                if(angkaRandom%4==0 && asad.getCount()!=1){
                    // membuat angka random baru
                    angkaRandom = randomizer.generateRandomNum();
                    // Menggunakan spesialskill milik asad
                    asad.spesialSkill(zhafran, angkaRandom);
                    // mengatur count menjadi 1, artinya sudah pernah memakai spesialskill, tidak bisa dipakai lagi
                    asad.setCount(1);
                }
                else{
                    // Jika spesialskill tidak keluar, maka attack biasa
                    asad.attack(zhafran, angkaRandom);
                }
            }
            else{
                // Jika health belum di bawah 50, maka attack biasa
                asad.attack(zhafran, angkaRandom);
            }
            // tampilkan nama dan health dari asad dan zhafran
            System.out.println(asad.getName() + " | " + asad.getHealth());
            System.out.println(zhafran.getName() + " | " + zhafran.getHealth());
            System.out.println();
            // Jika health zhafran 0 atau di bawah 0, maka zhafran sudah kalah, looping berhenti dengan break
            if(zhafran.getHealth()<=0){
                zhafran.dead(zhafran);
                break;
            }


            // Membuat angka random dengan randomizer
            angkaRandom = randomizer.generateRandomNum();
            // Jika health zhafran di bawah 50, memungkinkan untuk melakukan spesialskill
            if(zhafran.getHealth()<50){
                // angkaRandom%4==0 artinya 25% kemungkinan dan hanya bisa melakukan spesialskill 1x dilihat dari count
                if(angkaRandom%4==0 && zhafran.getCount()!=1){
                    // membuat angka random baru
                    angkaRandom = randomizer.generateRandomNum();
                    // Menggunakan spesialskill milih zhafran
                    zhafran.spesialSkill(asad, angkaRandom);
                    // mengatur count menjadi 1, artinya sudah pernah memakai spesialskill, tidak bisa dipakai lagi
                    zhafran.setCount(1);
                }
                else{
                    // Jika spesialskill tidak keluar, maka attack biasa
                    zhafran.attack(asad, angkaRandom);
                }
            }
            else{
                // Jika health belum di bawah 50, maka attack biasa
                zhafran.attack(asad, angkaRandom);
            }
            // tampilkan nama dan health dari asad dan zhafran
            System.out.println(asad.getName() + " | " + asad.getHealth());
            System.out.println(zhafran.getName() + " | " + zhafran.getHealth());
            System.out.println();
            // Jika health asad 0 atau di bawah 0, maka asad sudah kalah, looping berhenti dengan break
            if(asad.getHealth()<=0){
                asad.dead(zhafran);
                break;
            }
        }
    }
}
