import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dino {
    public void drawDino(String filePath) {
        File dinoFile = new File(filePath);
        try {
            BufferedReader readingDino = new BufferedReader(new FileReader(dinoFile));
            if (!dinoFile.exists()) {
                System.out.println("No such Dino");
            }
            String line = readingDino.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    System.out.print(line.charAt(i));
                }
                System.out.println();
                line = readingDino.readLine();
            }
        } catch (IOException e) {
            System.out.println("You did wrong");
        }
    }
}
