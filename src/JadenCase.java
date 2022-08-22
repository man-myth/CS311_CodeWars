public class JadenCase {
    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        String res = "";
        if(phrase!= null && !phrase.isEmpty()){
            String[] words = phrase.split(" ");
            for(int x=0; x <words.length; x++){
                res += words[x].substring(0,1).toUpperCase() + words[x].substring(1);
                if(x != words.length -1)
                    res += " ";
            }
            return res;
        }
        return null;
    }
}
