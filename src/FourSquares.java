import java.math.BigInteger;

public class FourSquares {
    public static BigInteger[] GetRepresentation (BigInteger n)
    {
        BigInteger[] result = new BigInteger[4];
        result[0] = BigInteger.ZERO;
        result[1] = BigInteger.ZERO;
        result[2] = BigInteger.ZERO;
        result[3] = BigInteger.ZERO;

        BigInteger one = BigInteger.ONE;

        for (BigInteger i = BigInteger.valueOf(0); i.multiply(i).compareTo(n) <= 0; i.add(one)) {
            for (BigInteger j = i; j.multiply(j).compareTo(n) <= 0; j.add(one)) {
                for (BigInteger k = j; k.multiply(k).compareTo(n) <= 0; k.add(one)) {
                    for (BigInteger l = k; l.multiply(l).compareTo(n) <= 0; l.add(one)) {
                        if (i.multiply(i).add(j.multiply(j)).add(k.multiply(k)).add(l.multiply(l)).compareTo(n) == 0) {
                                result[0] = i;
                                result[1] = j;
                                result[2] = k;
                                result[3] = l;
                            return result;
                        } else {
                            System.out.println("nah");
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        for (BigInteger i : GetRepresentation(BigInteger.valueOf(1))){
            System.out.println(i);
        }
    }
}
