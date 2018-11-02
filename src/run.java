public class run {
    public static void start() {
        Dino d = new Dino();
        WelcomeThread wt = new WelcomeThread();
        wt.run();
        d.drawDino("TextFiles/TRex");
        d.drawDino("TextFiles/Ground");
    }
    public static void main(String[] args) {
        start();
    }
}
