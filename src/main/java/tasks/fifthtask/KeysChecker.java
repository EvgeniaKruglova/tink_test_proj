package tasks.fifthtask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class KeysChecker {
    private List<String> referenceKeys;
    private final List<String> dbKeys = Arrays.asList("key1", "key2", "key3", "key4");

    KeysChecker(List<String> referenceKeys) {
        this.referenceKeys = referenceKeys;
    }

    void assertOddKeysExists() {
        List<String> oddKeys = getOddKeys();
        if (!oddKeys.isEmpty()) System.out.println(oddKeys);
    }

    void assertLostKeysExists() {
        List<String> lostKeys = getLostKeys();
        if (!lostKeys.isEmpty()) System.out.println(lostKeys);
    }

    private List<String> getOddKeys() {
        return dbKeys.stream().distinct().parallel().filter(key -> !referenceKeys.contains(key)).collect(Collectors.toList());
    }

    private List<String> getLostKeys() {
        return referenceKeys.stream().distinct().parallel().filter(key -> !dbKeys.contains(key)).collect(Collectors.toList());
    }
}