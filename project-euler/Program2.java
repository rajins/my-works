/*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Program2 {

    public static void main(String[] args) {
        long maxNumber = 4000000;
        long a = 1, b = 2;
        long temp = 2;
        while (a + b < maxNumber) {
            long result = a + b;
            a = b;
            b = result;
            if (result % 2 == 0) {
                temp = temp + result;
            }
        }
        System.out.println(temp);
    }
}
