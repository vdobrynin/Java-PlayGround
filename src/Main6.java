import java.util.Arrays;

public class Main6 {
    public static int[] numberGame(int[] nums) {
/*        int[] result = new int[nums.length];
        int resultInd = 0;

        // Make a copy of the input array to manipulate
        int[] orgArray = Arrays.copyOf(nums, nums.length);

        while (orgArray.length > 0) {
            // Find Alice's choice: the smallest element in the current working array
            var minAliceVal = Integer.MAX_VALUE;
            var aliceInd = -1;

            for (int i = 0; i < orgArray.length; i++) {
                if (orgArray[i] < minAliceVal) {
                    minAliceVal = orgArray[i];
                    aliceInd = i;
                }
            }

            // Remove Alice's choice from the working array
            int[] tempAlice = new int[orgArray.length - 1];
            System.arraycopy(orgArray, 0, tempAlice, 0, aliceInd);
            if (aliceInd < orgArray.length - 1) {
                System.arraycopy(orgArray, aliceInd + 1, tempAlice, aliceInd,
                        orgArray.length - aliceInd - 1);
            }

            // Find Bob's choice: the smallest element in the array after Alice removed her choice
            int minBobVal = Integer.MAX_VALUE;
            int bobInd = -1;

            for (int i = 0; i < tempAlice.length; i++) {
                if (tempAlice[i] < minBobVal) {
                    minBobVal = tempAlice[i];
                    bobInd = i;
                }
            }

            // Remove Bob's choice from the array
            int[] finalArray = new int[tempAlice.length - 1];
            System.arraycopy(tempAlice, 0, finalArray, 0, bobInd);
            if (bobInd < tempAlice.length - 1) {
                System.arraycopy(tempAlice, bobInd + 1, finalArray, bobInd,
                        tempAlice.length - bobInd - 1);
            }

            // Append Bob's choice first and then Alice's to the result array
            if (resultInd < result.length) {
                result[resultInd++] = minBobVal;
            }
            if (resultInd < result.length) {
                result[resultInd++] = minAliceVal;
            }

            // Update workingArray for next iteration
            orgArray = finalArray;
        }

        return result;
*/
/*
            int n = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < n; i += 2) {
                if (i + 1 < n) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            return nums;
*/

/*  Arrays.sort(nums);
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i += 2) {
            output[i] = nums[i + 1];
            output[i + 1] = nums[i];
        }
        return output;
*/
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        return nums;


   /*     Arrays.sort(nums);
        int f = 0;
        int b = 1;
        while(b <= nums.length - 1) {
            int temp = nums[b];
            nums[b] = nums[f];
            nums[f] = temp;
            f += 2;
            b += 2;
        }
        return nums;*/
    }

    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        System.out.println(Arrays.toString(numberGame(nums)));
    }
}
