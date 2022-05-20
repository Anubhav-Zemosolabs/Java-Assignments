package anubhav.assignment6.org;
import java.util.ArrayList;
import java.util.Collections;

public class VampireNumber {
    static void test(int  startValue,  int  stopValue) {
            int countOfRes = 1;
            StringBuilder result = new StringBuilder();
            Outer:for (int i = startValue; i <= stopValue; i++) {
                for (int j = i; j <= stopValue; j++) {
                    if (isVampireNumber(i, j)) {
                        result.append("").append(countOfRes).append(": = ( ").append(i).append(",").append(j).append(" = ").append(i * j).append(")").append("\n");
                        countOfRes++;
                        if(countOfRes>100) break Outer;
                    }
                }
            }

            System.out.println(result);
        }

        static boolean isVampireNumber(int a, int b) {
            if ((a * 10 <= b || b * 10 <= a)) return false;
            String mulDigits = splitIntoDigits(a*b,0);
            String factorDigits = splitIntoDigits(a,b);
            return mulDigits.equals(factorDigits);
        }

        // methode to Split the numbers to Digits

        static String splitIntoDigits(int num, int num2) {
                StringBuilder result = new StringBuilder();
                ArrayList<Integer> digits = new ArrayList<>();
                while (num > 0) {
                    digits.add(num%10);
                    num /= 10;
                }
                while (num2 > 0) {
                    digits.add(num2%10);
                    num2/= 10;
                }
                Collections.sort(digits);
                for (int i : digits) {
                    result.append(i);
                }
                return result.toString();
            }

        public static void main(String[] args) {
            test(10,1000);
        }
}
