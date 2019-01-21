package tasks.fifthtask;

import java.util.Arrays;
import java.util.List;

public class KeysCheckerTest {

    public static void main(String[] args) {
        List<String> keys1 = Arrays.asList("key2", "key3", "key4", "key5");
        List<String> keys2 = Arrays.asList("key1", "key2", "key3", "key4");
        KeysChecker keysChecker1 = new KeysChecker(keys1);
        KeysChecker keysChecker2 = new KeysChecker(keys2);

        System.out.println("Прверка первой пары ключей");
        keysChecker1.assertLostKeysExists();
        keysChecker1.assertOddKeysExists();

        System.out.println("Прверка второй пары ключей");
        keysChecker2.assertLostKeysExists();
        keysChecker2.assertOddKeysExists();
    }
}
