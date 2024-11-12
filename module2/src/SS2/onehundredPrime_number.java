package SS2;

public class onehundredPrime_number {
    public static void main(String[] args) {
        int num = 2;
        while (num <= 100) {
            if (IsPrime(num)) {
                System.out.printf("%d ", num);
            }
            num++;
        }
    }

    public static boolean IsPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}