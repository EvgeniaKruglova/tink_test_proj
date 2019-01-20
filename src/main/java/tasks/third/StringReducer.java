package tasks.third;

import java.util.Arrays;

class StringReducer {
    private String string;

    StringReducer(String string) {
        this.string = string;
    }

    String reduceLine() {
        return Arrays.stream(string.split(""))
                .reduce((left, right) -> left.equals(right)
                        ? ""
                        : left.endsWith(right) ? left.replace(right, "") : left.concat(right)
                )
                .orElseThrow(IllegalArgumentException::new);
    }
}
