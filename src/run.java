public class run {
    public static void start() {
        WelcomeThread wt = new WelcomeThread();
        ObstacleThread ot = new ObstacleThread();
        wt.run();
        ot.run();
    }
    public static void main(String[] args) {
        start();
    }
}
