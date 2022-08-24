import java.util.ArrayList;
import java.util.List;

public class HowManyNumbers {

    static Long count = 0L;
    static Long min = 0L;
    static Long max = 0L;
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        // Your code here!!
        List<Long> res = new ArrayList<>();


        getNumbers(0L, 1, sumDigits, numDigits);

        if (count > 0) {
            res.add(count);
            res.add(min);
            res.add(max);
        }
        return res;

    }
    private static void getNumbers(Long currNum, int prevNum, int sumLeft, int digitsLeft) {
        if (sumLeft == 0 && digitsLeft == 0) {
            if (count == 0) {
                min = currNum;
            }
            if(min < currNum){
                min = min;
            } else{
                min = currNum;
            }
            max = max > currNum ? max : currNum;
            if(min < currNum){
                min = min;
            } else{
                min = currNum;
            }
            count++;
        } else if (digitsLeft != 0) {
            for (int i = prevNum; i < 10; i++) {
                getNumbers(10 * currNum + i, i,sumLeft - i, digitsLeft - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<Long> ls= findAll(27,3);
        for (Long l: ls) {
            System.out.println(l);
        }
    }
}
