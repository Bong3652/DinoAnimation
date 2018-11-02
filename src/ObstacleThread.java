import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class ObstacleThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 7; i++) {
            File dinoFile = new File("TextFiles/Scene" + i);
            try {
                BufferedReader readingDino = new BufferedReader(new FileReader(dinoFile));
                if (!dinoFile.exists()) {
                    System.out.println("No such Dino");
                }
                String line = readingDino.readLine();
                while (line != null) {
                    for (int j = 0; j < line.length(); j++) {
                        System.out.print(line.charAt(j));
                    }
                    System.out.println();
                    line = readingDino.readLine();
                }
                System.out.println();
            } catch (IOException e) {
                System.out.println("You did wrong");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
