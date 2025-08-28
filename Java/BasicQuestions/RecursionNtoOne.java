
public class RecursionNtoOne {
    static void fun(int n) {
        // !Base condition
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    public static void main(String[] args) {
        fun(5);
    }
}
