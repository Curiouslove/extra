import java.security.SecureRandom;

public class RandomNumber {
    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        System.out.println(generateRandomEven());
        System.out.println(generateRandomPrime());
    }

    public static int generateRandomEven(){
        return 2 * (250_000 + random.nextInt(500_000));
    }

    public static int generateRandomPrime(){
        int prime = 0;
        int number = 500_000 + random.nextInt(1_000_001);
        for(int index = 2; index < number / 2 ; index++){
            if (number % index != 0)prime = number;
        }
        return prime;
    }
}
