package interviewprograms;

public class FindElementWithEqualSides {
	public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 4, 5};

        int index = findElementWithEqualSides(arr);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("No such element found");
        }
	}
        
        public static int findElementWithEqualSides(int[] arr) {
        	
        	
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }

            int leftSum = 0;
            for (int i = 0; i < arr.length; i++) {
                // Calculate right sum as totalSum - leftSum - arr[i]
                if (leftSum == totalSum - leftSum - arr[i]) {
                    return i;
                }
                leftSum += arr[i];
            }

            return -1; // No such element found
        }
}
