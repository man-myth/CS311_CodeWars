public class IncrementStrings {
    public static String incrementString(String str) {
        char[] chars = str.toCharArray();
        StringBuilder s = new StringBuilder();
        StringBuilder d = new StringBuilder();
        StringBuilder f = new StringBuilder();
        int zeros = 0;

        for(char c : chars){
            if(Character.isDigit(c)){
                d.append(c);
            }else {
                s.append(c);
            }
        }



        for(int i =0; i<d.length(); i++){
           // if
        }
        int i = Integer.parseInt(d.toString()) + 1;
        f.append(s).append(zeros).append(i);
        return f.toString();
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foo045"));
    }
}
