package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateNumber(int sizeNumber) {
        Random rand = new Random();
        return rand.nextInt(sizeNumber);
    }
}
