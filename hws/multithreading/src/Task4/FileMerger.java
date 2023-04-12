package Task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileMerger implements Runnable {

    private final String directory;
    private final String word;
    private boolean isLoaded;
    private Object lock;

    public FileMerger(String directory, String word, boolean isLoaded, Object lock) {
        this.directory = directory;
        this.word = word;
        this.lock = lock;
        this.isLoaded = isLoaded;
    }

    /*
        Первый должен найти файлы, содержащие искомое слово
        и слить их содержимое в один файл.
    */
    @Override
    public void run() {
        try (Stream<Path> files = Files.walk(Paths.get(directory))) {

            StringBuilder content = new StringBuilder();
            var paths = files.filter(f -> f.getFileName().toString().contains(word)).collect(Collectors.toList());

            for (var path: paths) {
                content.append(Files.readString(path));
            }

            var writer = new BufferedWriter(new FileWriter(directory.concat("\\merged_together.txt")));
            writer.append(content.toString());
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        synchronized (lock) {
            isLoaded = true;
            lock.notify();
        }
    }

}
