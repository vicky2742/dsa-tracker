public class RecursionSum {
    static int sum(int n) {
        // !Base condition
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}