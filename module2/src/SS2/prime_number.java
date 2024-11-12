package SS2;
public class prime_number {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        while (count < 20) {
            if (isPrime(num)){
                    System.out.printf("%d  ", num);
                    count++;
                }
                num++;
            }
        }


        public static boolean isPrime (int number){
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }