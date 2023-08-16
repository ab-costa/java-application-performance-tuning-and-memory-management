public class Main {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Integer size = Integer.parseInt(args[0]);
        primeNumbers.generateNumbers(size);
    }
}