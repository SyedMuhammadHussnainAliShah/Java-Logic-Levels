public class Q2_MagicnumberFinder {
    public static void main(String[] args) {
        System.out.println("Magic numbers between 1000 and 9999 are:");

        for (int num = 1000; num <= 9999; num++) {
            // Extract digits
            int d1 = num / 1000;           // 1st digit
            int d2 = (num / 100) % 10;    // 2nd digit
            int d3 = (num / 10) % 10;     // 3rd digit
            int d4 = num % 10;             // 4th digit

            int sumFirstTwo = d1 + d2;
            int sumLastTwo = d3 + d4;

            int sumAllDigits = d1 + d2 + d3 + d4;

            // Check conditions
            if (sumFirstTwo == sumLastTwo && num % sumAllDigits == 0) {
                System.out.println(num);
            }
        }
    }
}
