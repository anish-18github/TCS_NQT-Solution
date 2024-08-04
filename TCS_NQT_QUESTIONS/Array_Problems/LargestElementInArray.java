package TCS_NQT_QUESTIONS.Array_Problems;

/* 
Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array.
*/
public class LargestElementInArray {
    
   
    public static void main(String[] args) {
        int arr1[] = {2,5,1,3,0};
        System.out.println("Largest element in the array is: " +largestElement(arr1));

        int arr2[] = {8,10,5,7,9};
        System.out.println("Largest element in the array is: " +largestElement(arr2));
    }

    static int largestElement(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
