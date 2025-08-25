public class ArmStrongOrNot {
    public static void main(String[] args) {
        int n = 153;
        int originalNo = n;
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit * lastDigit;
            n = n / 10;
        }
        if (originalNo == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
