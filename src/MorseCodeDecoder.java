
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        morseCode = morseCode.trim();
        String[] words = morseCode.split("   ");
        String sentence = "";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String[] decoded = words[i].split(" ");
            for (int x = 0; x < decoded.length; x++) {
                decoded[x] = MorseCode.get(decoded[x]);
                sentence += decoded[x];
            }
            if (i != words.length - 1) {
                sentence += " ";

            }
        }
        return sentence.trim();
    }
}
