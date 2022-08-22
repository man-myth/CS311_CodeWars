import java.util.ArrayList;
import java.util.Arrays;

/**
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
 */
public class StringSplit {
    public static String[] solution(String s) {
        ArrayList<String> res = new ArrayList<>();
        String temp = "";
        for(int i = 0; i < s.length(); i++){
          if(i%2==0){
              temp = "";
              temp += s.charAt(i);
          } else {
              temp += s.charAt(i);
              res.add(temp);
            }
        }
        if(temp.length() == 1){
            temp += "_";
            res.add(temp);
        }
        String[] r = Arrays.copyOf(
                res.toArray(), res.size(), String[].class);
        return r;
    }

    public static void main(String[] args) {
        String[] s = solution("hello");
        for(String i : s){
            System.out.println(i);
        }
    }
}