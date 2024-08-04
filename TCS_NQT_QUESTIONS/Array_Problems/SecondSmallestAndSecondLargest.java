package TCS_NQT_QUESTIONS.Array_Problems;
/*Example 1:
Input:
 [1,2,4,7,7,5]
Output:
 Second Smallest : 2
Second Largest : 5

Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2 */

public class SecondSmallestAndSecondLargest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 7, 7, 5 };

        System.out.println("Second Smallest Element in the array: " + secondSmallest(arr));
        System.out.println("Second Largest Element in the array: " + secondLargest(arr));
    }

    static int secondSmallest(int arr[]) {
         // Check if the array has fewer than 2 elements
        if (arr.length < 2) {
            return -1;  // Not enough elements to find the second smallest
        }

        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

         // Iterate over the array to find the smallest and second smallest elements
        for (int num : arr) {
            if (num < smallest) {
                 // Update second smallest before updating smallest
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        // Return -1 if no valid second smallest element is found
        return (secondSmallest == Integer.MAX_VALUE) ? -1 : secondSmallest;
    }

    static int secondLargest(int arr[]) {
        
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                // Update second largest before updating largest
                secondLargest = largest;
                largest = num;
            }else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == largest) ? -1 : secondLargest;
    }
}
