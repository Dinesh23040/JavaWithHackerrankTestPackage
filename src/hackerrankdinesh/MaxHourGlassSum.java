package hackerrankdinesh;

public class MaxHourGlassSum {
    public static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;  // Initialize with minimum integer value
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate the sum of the hourglass pattern
                int hourglassSum = (
                    arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                    arr[i + 1][j + 1] +
                    arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
                );
                // Update maxSum if the current hourglass sum is greater
                maxSum = Math.max(maxSum, hourglassSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };

        // Calculate and print the maximum hourglass sum
        int maxHourglassSum = hourglassSum(arr);
        System.out.println("Maximum hourglass sum: " + maxHourglassSum);
    }
}

