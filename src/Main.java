import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortedlist = new ArrayList<>();
        for (Integer number : intList) {
            if ((number > 0) && (number % 2 == 0)) {
                sortedlist.add(number);
            }
        }
        Collections.sort(sortedlist);
        System.out.println(sortedlist);
    }
}

