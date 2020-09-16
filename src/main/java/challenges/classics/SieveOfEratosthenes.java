package challenges.classics;

public class SieveOfEratosthenes {

    public void print(int upperBound) {
        int upperBoundSquareRoot = (int) Math.sqrt(upperBound);

        // isComposite means not prime
        boolean[] isComposite = new boolean[upperBound + 1];

        // going from prime 2 up to sqrt n
        for (int m = 2; m <= upperBoundSquareRoot; m++) {

            // if prime
            if (!isComposite[m]) {
                // Print it...
                System.out.print(m + " ");

                // Then mark all the others multiples as no prime
                for (int k = m * m; k <= upperBound; k += m) {
                    isComposite[k] = true;
                }
            }
        }

        System.out.println("\nEverything left over is prime...");

        for (int m = upperBoundSquareRoot; m <= upperBound; m++) {
            if (!isComposite[m])
                System.out.print(m + " ");
        }

    }


    public void printByDoga(int upperBound) {

        for(int i=2;i<upperBound;i++){

       if(checkPrime(i) ==true){
           System.out.println(i);
       }

        }

    }

    public static boolean checkPrime(int numberToCheck) {
        int remainder; //kalan
        for (int i = 2; i <= numberToCheck / 2; i++) { //hiçbir sayı kendisinin yarısından fazlasına bölünemez, o yuzden / 2 den geçmemiz gerek. Giriş 17 ise, yarısı 8,5 ise ve döngü 2 ile 8 arasındaki değerler boyunca yinelenecektir
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }


}
