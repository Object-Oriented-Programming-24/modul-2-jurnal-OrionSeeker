public class Driver {
    public static void main(String[] args) {
        Hero asad = new Hero("As'ad Sakai", 100, 15);
        Villain zhafran = new Villain("Zhafran Khan", 100, 15);

        Random randomizer = new Random(System.currentTimeMillis());

        asad.showCharacter();
        zhafran.showCharacter();
        System.out.println();

        while(asad.getHealth() >= 0 && zhafran.getHealth()>=0){
            int angkaRandom = randomizer.generateRandomNum();
            if(asad.getHealth()<50){
                if(angkaRandom%4==0 && asad.getCount()!=1){
                    angkaRandom = randomizer.generateRandomNum();
                    asad.spesialSkill(zhafran, angkaRandom);
                    asad.setCount(1);
                }
                else{
                    asad.attack(zhafran, angkaRandom);
                }
            }
            else{
                asad.attack(zhafran, angkaRandom);
            }
            System.out.println(asad.getName() + " | " + asad.getHealth());
            System.out.println(zhafran.getName() + " | " + zhafran.getHealth());
            System.out.println();
            if(zhafran.getHealth()<=0){
                zhafran.dead(zhafran);
                break;
            }


            angkaRandom = randomizer.generateRandomNum();
            if(zhafran.getHealth()<50){
                if(angkaRandom%4==0 && zhafran.getCount()!=1){
                    angkaRandom = randomizer.generateRandomNum();
                    zhafran.spesialSkill(asad, angkaRandom);
                    zhafran.setCount(1);
                }
                else{
                    zhafran.attack(asad, angkaRandom);
                }
            }
            else{
                zhafran.attack(asad, angkaRandom);
            }
            System.out.println(asad.getName() + " | " + asad.getHealth());
            System.out.println(zhafran.getName() + " | " + zhafran.getHealth());
            System.out.println();
            if(asad.getHealth()<=0){
                asad.dead(zhafran);
                break;
            }
        }
    }
}
