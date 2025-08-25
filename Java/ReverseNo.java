
public class ReverseNo {
    public static void main(String[] args) {
        int n = 123;
        int lastDigit, rev = 0;
        while (n != 0) {
            lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        System.out.print(rev);
    }
}
