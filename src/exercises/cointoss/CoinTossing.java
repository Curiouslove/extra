package exercises.cointoss;

import java.security.SecureRandom;

public class CoinTossing {
    public static Coin flip(){
        SecureRandom random = new SecureRandom();
        int choice = random.nextInt(2);

        if (choice == 0){
            return Coin.TAILS;
        }else
            return Coin.HEADS;
    }
}
