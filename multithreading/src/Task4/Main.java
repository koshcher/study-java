package Task4;

import java.util.Scanner;

/*
Задание 4
Второй поток ожидает завершения работы первого потока.
После чего проводит вырезание всех запрещенных слов (список
    этих слов нужно считать из файла с запрещенными словами) изполученного файла.
В методе main необходимо отобразить статистику выполненных операций.
 */
public class Main {
    // TODO: replace with path on your pc
    private static final String BAD_WORD_FILE = "C:\\Users\\roman\\git\\koshcher\\study-java\\multithreading\\assets\\badwords.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to a directory:");
        var directoryPath = scanner.nextLine();

        System.out.println("Enter a word to search:");
        var word = scanner.nextLine();

        Object lock = new Object();
        boolean isLoaded = false;

        var merger = new FileMerger(directoryPath, word, isLoaded, lock);
        Thread mergerThread = new Thread(merger);
        mergerThread.start();

        var badWordFilter = new BadWordFilter(directoryPath, BAD_WORD_FILE,isLoaded,lock);
        Thread filterThread = new Thread(badWordFilter);
        filterThread.start();

    }
}
