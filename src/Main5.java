public class Main5 {
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num - 1) % 9 + 1;
        }
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println(addDigits(n));
    }
}
