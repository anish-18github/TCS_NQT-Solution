package TCS_NQT_QUESTIONS.Array_Problems;

/*
 Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
 */

public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = { 7, 6, 5, 4, 3, 2, 1 };
        int n = arr.length;
        System.out.print("original Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        
        System.out.print("Reverse array: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + arr[n - i]);

        }
    }
}
