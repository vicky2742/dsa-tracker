public class ReverseArr {

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void reverseArr(int[] arr) {
        int startIdx = 0;
        int endIdx = arr.length - 1;
        while (startIdx < endIdx) {
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 5 };
        reverseArr(myArray);

    }
}
