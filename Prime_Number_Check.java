public class Prime_Number_Check {
    public static void main(String[] args) {
        int num = 37;
        int count = 0;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;

                if (i != num / i) {
                    count = count + 1;
                }
            }
        }

        if (count == 2) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
