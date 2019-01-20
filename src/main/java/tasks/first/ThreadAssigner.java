package tasks.first;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class ThreadAssigner {
    private static List<Integer> ids = new LinkedList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    private static int id;

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10)

                .parallel()

                .forEach(val -> {
                    id = catchId();
                    System.out.println(String.format("First test. Thread %s have unique id %s", val, id));
                    putId(id);
                });



        IntStream.rangeClosed(1, 15)

                .parallel()

                .forEach(val -> {
                    id = catchId();
                    System.out.println(String.format("First test. Thread %s have unique id %s", val, id));
                    putId(id);
                });

    }

    private synchronized static int catchId() {
        Iterator<Integer> itr = ids.iterator();
        int id;

        if (!itr.hasNext()) {
            System.out.println("нет свободных id");
        }

        id = itr.next();
        itr.remove();

        return id;
    }

    private synchronized static void putId(int id) {
        ids.add(id);
    }

}
