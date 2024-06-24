import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        Iterator<Integer> intListIterator = intList.iterator();
        while (intListIterator.hasNext()) {
            Integer value = intListIterator.next();
            if (value <= 0) {
                intListIterator.remove();
            }
            if (value % 2 == 1) {
                intListIterator.remove();
            }
        }
        intList.sort(Comparator.naturalOrder());
        intList.forEach(System.out::println);
    }
}