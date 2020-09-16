package algorithms;

public class Global {

    public boolean isEven(int n){
        if(n %2==0)
            return true;

        return false;

    }

    public String palindrome(String s) {
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        return sb.reverse().toString();
    }

    public boolean isPrime(int n) {
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
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
