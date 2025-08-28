
class LargerElement {

    static void findLargerElement(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The largest element is: " + max);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 23 };
        findLargerElement(arr);
    }

}
