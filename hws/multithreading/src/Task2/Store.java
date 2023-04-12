package Task2;

import java.util.LinkedList;
import java.util.List;

public class Store {
    final public String path;
    public Store(String path) {
        this.path = path;
    }

    public boolean isFilled = false;
    public List<Integer> primeNums = new LinkedList<>();
    public List<Long> factorialNums = new LinkedList<>();
}
