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
        int arr[] = {1};

        System.out.println("Second Smallest Element in the array: " +secondSmallest(arr));

        System.out.println("Second Largest Element in the array: " + secondLargest(arr));
    }

    static int secondSmallest(int arr1[]) {

        int n = arr1.length;
        if (n < 2) {
            return -1;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                int temp = 0;
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
            System.out.println(arr1[i]);
        }
        return arr1[1];
    }

    static int secondLargest(int arr2[]) {

        int n = arr2.length;
        if (n < 2) {
            return -1;
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                int temp = 0;
                if (arr2[i] > arr2[j]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        
        return arr2[arr2.length - 2];
    }
}
