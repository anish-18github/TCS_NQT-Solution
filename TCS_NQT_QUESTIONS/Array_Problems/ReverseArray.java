package TCS_NQT_QUESTIONS.Array_Problems;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,7,5,3,2,5,7,8};
        int n = arr.length;
        System.out.print("original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " +arr[i]);
        }
        System.out.println();
        System.out.print("Reverse array: ");
        for (int i = 1; i<=n; i++) {
            System.out.print(" " + arr[n-i]);

        }
    }
}
