package Task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BadWordFilter implements Runnable {
    private final String directory;
    private List<String> badWords;
    private final String badWordsFile;
    private boolean isLoaded;
    private Object lock;

    public BadWordFilter(String directory, String badWordsFile, boolean isLoaded, Object lock) {
        this.directory = directory;
        this.badWordsFile = badWordsFile;
        this.lock = lock;
        this.isLoaded = isLoaded;
    }

    private void loadBadWords () {
        try {
            var mergeContent = Files.readString(Path.of(badWordsFile));
            badWords = Arrays.stream(mergeContent.split("\n")).collect(Collectors.toList());
        } catch (IOException ex) {
            badWords = new ArrayList<>();
        }
    }

    @Override
    public void run() {
        synchronized (lock) {
            if(!isLoaded) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        try {
            loadBadWords();

            var mergeContent = Files.readString(Path.of(directory.concat("\\merged_together.txt")));
            for (var badWord: badWords) {
                mergeContent = mergeContent.replace(badWord, "");
            }

            var writer = new BufferedWriter(new FileWriter(directory.concat("\\bad_words_filtered.txt")));
            writer.append(mergeContent);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
