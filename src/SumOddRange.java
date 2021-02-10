public class SumOddRange {

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) { // check for isOdd
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0; // initialize rolling sum
        if ((start <= 0) || (end <= 0) || (end < start)) { // check for valid variable values
            return -1;
        }
        for (int i=start; (end >= i); i++) { // Walk the range
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}

