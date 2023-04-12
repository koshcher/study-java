package Task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileFinder {
    protected <T> void writeResToFile(String path, String name, List<T> list)  {
        try
        {
            String dir = path.substring(0, path.lastIndexOf("\\"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(dir.concat("\\").concat(name)));

            for (var item: list) {
                writer.append(String.valueOf(item));
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
