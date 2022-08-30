import java.math.BigInteger;

public class IncrementStrings {
    public static String incrementString(String str) {
        char[] chars = str.toCharArray();
        String s = ""; //string
        String d = ""; //digits
        StringBuilder f = new StringBuilder(); //final
        StringBuilder zeros = new StringBuilder();
        int num = 0 ;           //number of digits
        int index = 0;
        for (int g = chars.length-1; g >= 0; g--){
            if (!Character.isDigit(chars[g])){
                index = g+1;
                break;
            }
        }
        s = str.substring(0,index);
        d = str.substring(index);

        num = d.length(); // get number of digits

        BigInteger i;             // add 1
        if(d.toString().isEmpty()){
            i = new BigInteger("1");
        } else{
            i = new BigInteger(d.toString()).add(new BigInteger("1"));
        }
        int r = num - String.valueOf(i).length(); // numbers of remaining digits
        for(int j = 0; j < r; j++){
            zeros.append('0');
        }
        f.append(s).append(zeros).append(i);
        return f.toString();
    }
}

