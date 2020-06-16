import javax.print.DocFlavor;
import java.util.Random;
import java.math.BigInteger;

public class rsaTry {
    static class client{
        public static BigInteger enc;
        public static String enncc;
        public static void run() {
            String hi = "hello, this is decrypted";
            int BIT_LENGTH = 2048;
            // Generate random primes
            Random rand = new Random(55555);
            BigInteger p = BigInteger.probablePrime(BIT_LENGTH / 2, rand);
            BigInteger q = BigInteger.probablePrime(BIT_LENGTH / 2, rand);
            // Calculate products
            BigInteger n = p.multiply(q);
            BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
            // Generate public and private exponents
            BigInteger e;
            do {
                e = new BigInteger(phi.bitLength(), rand);
            } while (e.compareTo(BigInteger.ONE) <= 0 || e.compareTo(phi) >= 0 || !e.gcd(phi).equals(BigInteger.ONE));
            // Message encryption
            BigInteger msg = new BigInteger(hi.getBytes());  // Any integer in the range [0, n)
            enc = msg.modPow(e, n);
            enncc = enc.toString();
            System.out.println(enc.toString());
        }
    }

    static class host{
        public static void run() {
            int BIT_LENGTH = 2048;
            // Generate random primes
            Random rand = new Random(55555);
            BigInteger p = BigInteger.probablePrime(BIT_LENGTH / 2, rand);
            BigInteger q = BigInteger.probablePrime(BIT_LENGTH / 2, rand);
            // Calculate products
            BigInteger n = p.multiply(q);
            BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
            // Generate public and private exponents
            BigInteger e;
            do {
                e = new BigInteger(phi.bitLength(), rand);
            } while (e.compareTo(BigInteger.ONE) <= 0 || e.compareTo(phi) >= 0 || !e.gcd(phi).equals(BigInteger.ONE));
            BigInteger d = e.modInverse(phi);

            // Message decryption
            BigInteger dec = new BigInteger(client.enncc).modPow(d, n);
            System.out.println(dec);
            System.out.println(new String(dec.toByteArray()));
        }
    }
    public static void main(String[] args) {
        // User parameter RSA bit length
        client.run();
        host.run();
    }
}
