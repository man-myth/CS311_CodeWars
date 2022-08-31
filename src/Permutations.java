import java.util.ArrayList;
import java.util.List;

class Permutations {

    public static List<String> res = new ArrayList<>();

    public static List<String> singlePermutations(String s) {
        possibleStr(s, 0,s.length()-1);
        List<String> a = res;
        res = new ArrayList<>();
        return a;
    }
    public static void possibleStr(String s, int lI, int rI){
        if (lI == rI){
            if (!res.contains(s)){
                res.add(s);
            }
        }
        else {
            for (int i = lI; i <= rI; i++) {
                s = swap(s,lI,i);
                possibleStr(s, lI+1, rI);
                s = swap(s,lI,i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        for (String s : singlePermutations("aabb")){
            System.out.println(s);
        }
    }
}