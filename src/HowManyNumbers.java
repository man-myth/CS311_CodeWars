import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class HowManyNumbers {
    public static List<Long> findAll(int sumDigits, int numDigits) {
        List<long[]> numbers = new ArrayList<>();  // list of numbers in array ex.[[1,2,3]]
        List<Long> allNumbers = new ArrayList<>(); // list of numbers ex: [123]
        List<Long> res = new ArrayList<>();        // consists [count, min, max]
        for(long[] x: digits(numDigits, 1L)){
            if (LongStream.of(x).sum() == sumDigits){
                numbers.add(x);
            }
        }
        if (numbers.size() != 0){
            for (long[] l : numbers){
                Long L = 0L;
                for (int i = 0; i <l.length; i++){
                    L = L*10 + l[i];
                }
                allNumbers.add(L);
            }

            Long max = allNumbers.get(allNumbers.size()-1);
            Long min = allNumbers.get(0);
            res.add((long) allNumbers.size());
            res.add(min);
            res.add(max);
        }
        return res;
    }

    private static List<long[]> digits(int d, long start){
        List<long[]> digs = new ArrayList<>();
        if(d == 1){
            for (long i = start; i <10; i++){
                digs.add(new long[]{i});
            }
        } else{
            for (long i = start; i <10; i++){
                for (long[] j: digits(d-1, i)){
                    long[] nums = new long[d]; // [1] + [2,3] = [1,2,3]
                    nums[0] = i;
                    for (int t = 0; t<j.length; t++){
                        nums[t+1] = j[t];
                    }
                    digs.add(nums);
                }
            }
        }
        return digs;
    }
    
}
