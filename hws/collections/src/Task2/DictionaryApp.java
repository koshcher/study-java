package Task2;

import java.util.*;

/*
    Задание 2
    Создать программу по работе со словарем. Например,
    англо-испанский или французско-немецкий, или любое
    другое направление. Программа должна:
    ■ Обеспечивать начальный ввод данных для словаря;
    ■ Позволять отобразить слово и его ПЕРЕВОды;
    ■ Позволять добавить, заменить, удалить переводы слова;
    ■ Позволять добавить, заменить, удалить слово;
    ■ Отображать топ-10 самых популярных слов (определяем популярность на основании счетчика обращений);
    ■ Отображать топ-10 самых непопулярных слов (определяем непопулярность на основании счетчика обращений).
 */
public class DictionaryApp {
    private Map<String, Translation> dict = new Hashtable<>();

    public void input() {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (true) {
            System.out.println("[0] add word");
            System.out.println("[others] end");

            choice = scanner.nextInt();

            if(choice != 0) break;

            var translation = new Translation();

            System.out.println("Enter a word: ");
            var word = scanner.nextLine();

            while (true) {
                System.out.println("[0] add translation");
                System.out.println("[others] end");

                choice = scanner.nextInt();
                if(choice != 0) break;

                System.out.println("Enter a translation: ");
                translation.add(scanner.nextLine());
            }

            if(translation.isValid()) {
                dict.put(word, translation);
            }
        }
    }

    public void showTranslations(String word) {
        var translation = dict.get(word);

        if(translation == null) {
            System.out.println("Word isn't found");
            return;
        }

        System.out.println("Word: " + word);
        System.out.println("Translations:");
        for (String wordTranslation: translation.all()) {
            System.out.println("- " + wordTranslation);
        }

        translation.incrementAppealCount();
    }

    public void addWord(String word, Translation translation) {
        dict.put(word, translation);
    }

    public void editWord(String word, String newWord) {
        var translation = dict.get(word);
        if(translation == null) return;
        dict.remove(word);
        dict.put(newWord, translation);
    }

    public void deleteWord(String word) {
        dict.remove(word);
    }

    public void addTranslation(String word, String translation) {
        var translationObj = dict.get(word);
        if(translationObj == null) return;
        translationObj.add(translation);
    }

    public void deleteTranslation(String word, String translation) {
        var translationObj = dict.get(word);
        if(translationObj == null) return;
        translationObj.delete(translation);

    }

    public void editTranslation(String word, String oldTranslation, String newTranslation){
        var translationObj = dict.get(word);
        if(translationObj == null) return;
        translationObj.delete(oldTranslation);
        translationObj.add(newTranslation);
    }

    public void showMostPopularWords() {
        Comparator<Map.Entry<String, Translation>> usageComparator = new Comparator<Map.Entry<String, Translation>>() {
            @Override
            public int compare(Map.Entry<String, Translation> o1, Map.Entry<String, Translation> o2) {
                return o1.getValue().getAppealCount().compareTo(o2.getValue().getAppealCount());
            }
        };

        dict.entrySet()
            .stream()
            .sorted(usageComparator)
            .limit(10)
            .forEach((Map.Entry<String, Translation> entry) -> {
                System.out.println("Word: " + entry.getKey());
                System.out.println("Translations:");
                for (String wordTranslation: entry.getValue().all()) {
                    System.out.println("- " + wordTranslation);
                }
            });
    }

    public void showLeastPopularWords() {
        Comparator<Map.Entry<String, Translation>> usageComparator = new Comparator<Map.Entry<String, Translation>>() {
            @Override
            public int compare(Map.Entry<String, Translation> o1, Map.Entry<String, Translation> o2) {
                return o2.getValue().getAppealCount().compareTo(o1.getValue().getAppealCount());
            }
        };

        dict.entrySet()
                .stream()
                .sorted(usageComparator)
                .limit(10)
                .forEach((Map.Entry<String, Translation> entry) -> {
                    System.out.println("Word: " + entry.getKey());
                    System.out.println("Translations:");
                    for (String wordTranslation: entry.getValue().all()) {
                        System.out.println("- " + wordTranslation);
                    }
                });
    }
}
