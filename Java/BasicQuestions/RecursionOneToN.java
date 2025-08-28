
public class RecursionOneToN {
    static void fun(int n) {
        // !Base condition
        if (n == 0) {
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun(100);
    }
}
