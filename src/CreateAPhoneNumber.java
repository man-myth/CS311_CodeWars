public class CreateAPhoneNumber {
    public static void main(String[] args) throws Exception {
       
    }
    public static String createPhoneNumber(int[] numbers){
        String firstThree = "";
        String nextThree = "";
        String lastNumbers = "";
        for (int i = 0; i < numbers.length; i++){
            if (i <3){
                firstThree += numbers[i];
            }
            if (i >= 3 & i < 6){
                nextThree += numbers[i];
            }
            if (i >=6){
                lastNumbers += numbers[i];
            }
        }
        return "(" + firstThree + ") " + nextThree + "-" + lastNumbers;
    }
}
