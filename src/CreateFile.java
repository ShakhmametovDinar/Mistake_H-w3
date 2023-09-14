import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class CreateFile {
    public static void createFiles(String name, ArrayList<String> info) {
        try {
            BufferedWriter file = null;
            file = new BufferedWriter(new FileWriter(name));
            for (int i = 0; i < info.size(); i++) {
                file.write(info.get(i) + " ");
            }
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}