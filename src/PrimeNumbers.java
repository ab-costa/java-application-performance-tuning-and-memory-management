import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    private List<Integer> primeNumbers;

    private Boolean isPrimeNumber(Integer number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }

    private Integer getNextPrimeNumberAbove(Integer number) {
        Integer currentNumber = number + 1;

        while (!isPrimeNumber(currentNumber)) {
            currentNumber++;
        }

        return currentNumber;
    }

    public void generateNumbers(Integer size) {
        primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(2);

        Integer currentNumber = 2;

        while (primeNumbers.size() <= size) {
            currentNumber = getNextPrimeNumberAbove(currentNumber);
            primeNumbers.add(currentNumber);
        }

        System.out.println(primeNumbers);
    }
}
