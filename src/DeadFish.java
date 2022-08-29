import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static void main(String[] args) throws Exception {
        String data = "iiisdoso";
    }

    public static int[] parse(String data) {
        char[] charArray = data.toCharArray();
        int value = 0;
        List<Integer> intArray = new ArrayList<Integer>();
        for (char c : charArray) {
            System.out.println(c);
            if (c == 'i') {
                value++;
            } else if (c == 'd') {
                value--;
            } else if (c == 's') {
                value = value * value;
            } else if (c == 'o') {
                intArray.add(value);
            } else {
                continue;
            }
        }
        return intArray.stream().mapToInt(Integer::intValue).toArray();
    }
}
