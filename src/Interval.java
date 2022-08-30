
public class Interval {

    public static int sumIntervals(int[][] intervals) {

        int count = 0;
        int start = 0;
        int end = 0;
        int iterations = 5;

        for(int i = 0 ; i < intervals.length; i++){
            if(intervals[i][1] <= intervals[i][0]){
                continue;
            }
            start = intervals[i][0];
            end = intervals[i][1];

            while (iterations > 0) {
                for (int y = i + 1; y < intervals.length; y++) {
                    if (intervals[y][0] >= start && intervals[y][0] <= end) {
                        if (intervals[y][1] > end) {
                            end = intervals[y][1];
                            iterations ++;
                        }
                        intervals[y][0] = 0;
                        intervals[y][1] = 0;

                    } else if (intervals[y][0] <= start && intervals[y][1] >= start) {
                        start = intervals[y][0];
                        end = intervals[y][1] > end ? intervals[y][1] : end;
                        iterations ++;
                        intervals[y][0] = 0;
                        intervals[y][1] = 0;
                    }
                }
                iterations--;
            }

            count += end - start;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{{-350, -338},
                {-365, -360}, {-13, 6}, {-449, -440}, {189, 207}, {361, 374},{-226, -219},{-38, -34},{361, 37}}));
    }
}

