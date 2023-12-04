public class HarmonicSeriesSum {
    public static void main(String[] args) {
        int n = 5; // Replace with the desired value of n

        double harmonicSum = calculateHarmonicSum(n);

        System.out.println("The sum of the harmonic series for n = " + n + " is: " + harmonicSum);
    }

    public static double calculateHarmonicSum(int n) {
        if (n <= 0) {
            System.out.println("Error: n should be a positive integer.");
            return 0;
        }

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
