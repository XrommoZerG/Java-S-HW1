import java.math.BigInteger;

class Answer2 {
    /*static boolean checkPrime(long n) {
        // Converting long to BigInteger
        BigInteger b = new BigInteger(String.valueOf(n));

        return b.isProbablePrime(1);
    }
     */
    static boolean IsSimple(int ANum) {
        if (ANum < 2)
            return false;
        double s = Math.sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
    }
    public void printPrimeNums() {
        // Напишите свое решение ниже
        System.out.println(1);

        for (int i = 1; i < 1000; i++) {
            if (IsSimple(i)) {
                System.out.println(i);
            }


        }

    }
}

public class Task2 {
    public static void main(String[] args) {

        Answer2 ans = new Answer2();
        ans.printPrimeNums();
    }

}
