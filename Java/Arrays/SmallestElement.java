
public class SmallestElement {
    static void findSmallestElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The smallest element is: " + min);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 23 };
        findSmallestElement(arr);
    }
}
