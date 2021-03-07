import java.util.Arrays;
import java.util.Collections;

public class zad2 {
    public static void main(String[] args) {
        String[] stringArray = {"g", "c", "e", "f", "k", "l", "m", "r", "a", "j"};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(stringArray));
    }
}