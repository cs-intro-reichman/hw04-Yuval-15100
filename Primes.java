public class Primes {
    public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);

    boolean[] isPrime = new boolean[(int) n + 1];
    
    int i = 2;

    while (i <= n) {
        isPrime[i] = true;
        i++; }

    int p = 2;

    while (p * p <= n) {
        if (isPrime[p]) {
            int j = p * p; 

            while (j <= n) {
                isPrime[j] = false;
                j = j + p; }
        }
        p++; }

    System.out.println("Prime numbers up to " + n + ":");

    int numberOfPrimes = 0;
    int a = 2;
  
    while (a <= n) {
        if (isPrime[a]) {
            System.out.println(a);
            numberOfPrimes++; }
       
        a++; }

    double percent = (double) numberOfPrimes * 100 / (double) n;

    System.out.println("There are " + numberOfPrimes + " primes between 2 and " +
     n + " (" + (int) Math.floor(percent) + "% are primes)");
    
    }
}