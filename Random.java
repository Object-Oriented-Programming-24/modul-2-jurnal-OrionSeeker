public class Random {
    private long seed;

    public Random(long s){
        this.seed = s;
    }

    public int generateRandomNum(){
        seed = (seed * 18607)%2147483647;
        return (int) seed;
    }
}
