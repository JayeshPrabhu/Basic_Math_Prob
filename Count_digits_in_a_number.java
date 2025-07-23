public class Count_digits_in_a_number {
    public static void main(String[] args) {
        int num= 12365;
        int count= (int) Math.log10(num)+1;
        System.out.println(count);
    }
}
