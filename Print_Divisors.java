import java.util.ArrayList;

public class Print_Divisors {
    public static void main(String[] args) {
        int num= 8;
        int sqrt =(int ) Math.sqrt(num);
        System.out.println(sqrt);
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= sqrt; i++) {
            if(num%i==0) {
                divisors.add(i);
            }
               if(i!=num/i){
                   divisors.add(num/i);
               }

        }
        System.out.println(divisors);
    }
}
