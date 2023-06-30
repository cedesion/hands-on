import java.util.ArrayList;
import java.util.List;
class PrimeCalculator {
    int nth(int nth) {
        if (nth == 0) {
            throw new IllegalArgumentException();
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; primes.size() <= nth; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes.get((nth - 1));
    }
    protected boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
