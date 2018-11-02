import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WelcomeThread implements Runnable {
    @Override
    public void run() {
        File dinoFile = new File("TextFiles/Welcome");
        try {
            BufferedReader readingDino = new BufferedReader(new FileReader(dinoFile));
            if (!dinoFile.exists()) {
                System.out.println("No such Dino");
            }
            String line = readingDino.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    System.out.print(line.charAt(i));
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException welcomeSleep) {
                        System.out.println("Welcome Sleeping");
                    }
                }
                System.out.println();
                line = readingDino.readLine();
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("You did wrong");
        }
    }
}
