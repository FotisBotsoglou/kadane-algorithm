public class KadaneAlgorithm {
    /**
     *
     * An implementation of Kadane's Algorithm.A dynamic implementation
     * on calculate the maximum sub-array sum ending at each position of the array.
     */

    public static int maxSubarraySum(int[] arr) {

        // We initialize two variables in order to keep track of the results we want.
        int max_so_far = 0; // maximum sub - array sum
        int max_ending_here = 0; // sub - array sum at the current position

        //One iteration through the array,
        // Constant time operation inside the loop,
        // The time taken by the algorithm increases linearly as the length of the array grows,
        // Summary: Since the algorithm processes each element of the array only once and
        // performs constant time operations the time complexity of the algorithm is O(n).

        for (int i = 0; i < arr.length; i++) {

            // the local max-sum changes as we loop through the array's elements.
            max_ending_here = max_ending_here + arr[i];

            // if we have a negative integer we set the local sum equals to zero.
            if (max_ending_here < 0) {

                max_ending_here = 0;

            }
            // we make the comparison with the overall sub - array sum
            if (max_so_far < max_ending_here) {

                max_so_far = max_ending_here;

            }

        }

        return max_so_far;

    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = maxSubarraySum(arr);

        System.out.println("Maximum sub-array sum is " + maxSum);
    }
}
