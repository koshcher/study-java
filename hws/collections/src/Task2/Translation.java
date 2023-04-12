package Task2;

import java.util.ArrayList;

public class Translation {
    private int appealCount = 0;
    private ArrayList<String> list = new ArrayList<>();

    public Integer getAppealCount() {
        return appealCount;
    }

    public void incrementAppealCount() {
        ++appealCount;
    }

    public ArrayList<String> all() {
        return list;
    }

    public void add(String translation) {
        list.add(translation);
    }
    public void delete(String translation) {
        list.remove(translation);
    }

    public boolean isValid() {
        return !list.isEmpty();
    }

}
