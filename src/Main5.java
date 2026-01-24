public class Main5 {
   /* public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num - 1) % 9 + 1;
        }
    }*/
        public static int addDigits(int num) {
            num = Math.abs(num); // Handle negative numbers
            while (num >= 10) {
                int sum = 0;
                while (num > 0) {
                    sum = sum + num % 10;
//                    sum += num % 10;
                    num = num / 10;
//                    num /= 10;
                }
                num = sum;
            }
            return num;
        }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(addDigits(n));
    }
}
