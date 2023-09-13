import java.security.spec.RSAOtherPrimeInfo;

public class Multiples {
    public static int main(int n, int a, int b) {
        int num;
        int count = 0;
        for (num = 1; num<n; num++){
            if (((num % a) == 0) || ((num % b) == 0)){
            count ++;
            }
        }
        return count;
    }
}
