public class run {
    public static void start() {
        Dino d = new Dino();
        WelcomeThread wt = new WelcomeThread();
        ObstacleThread ot = new ObstacleThread();
        wt.run();
        d.drawDino("TextFiles/TRex");
        ot.run();
        for (int i = 1; i < 4; i++) {
            d.drawDino("TextFiles/Scene" + i);
        }
    }
    public static void main(String[] args) {
        start();
    }
}
