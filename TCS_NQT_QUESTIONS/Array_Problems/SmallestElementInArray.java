package TCS_NQT_QUESTIONS.Array_Problems;
import java.util.Scanner;

/* 
Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.
*/

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];

        System.out.println("Enter elements: ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt(); //{2,5,1,3,0}
        }
        System.out.println("Smallest element in the first array is: " + smallestElement(arr1));

        int arr2[] = new int[5];
        System.out.println("Enter elements: ");
        
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt(); // {8,10,5,7,9}
        }
        System.out.println("Smallest element in the second array is: " +smallestElement(arr2));

        sc.close();
    }

    static int smallestElement(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min  = arr[i];
            }
        }
        return min;
    }
}
