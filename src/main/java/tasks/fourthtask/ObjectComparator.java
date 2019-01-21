package tasks.fourthtask;


import org.assertj.core.api.SoftAssertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ObjectComparator {

    public static void main(String[] args) {
        ObjectA objectA11 = new ObjectA("field1", "fieldValue1");
        ObjectA objectA12 = new ObjectA(objectA11, "field1", "other value");
        ObjectA objectA21 = new ObjectA("field2", "fieldValue2");
        ObjectA objectA22 = new ObjectA(objectA21, "other field", "fieldValue2");
        ObjectA objectA31 = new ObjectA("field3", "fieldValue3");
        ObjectA objectA32 = new ObjectA(objectA31, "other field", "other value");

        List<ObjectA> list1 = createObjAList(objectA11, objectA21, objectA31);
        List<ObjectA> list2 = createObjAList(objectA11, objectA21, objectA31);
        List<ObjectA> list3 = createObjAList(objectA12, objectA21, objectA31);
        List<ObjectA> list4 = createObjAList(objectA12, objectA22, objectA32);
        List<ObjectA> list5 = createObjAList(objectA12, objectA22, objectA32, objectA11);
        List<ObjectA> list6 = createObjAList(objectA11, objectA21);

        compareTwoLists(list1, list2);
        compareTwoLists(list1, list3);
        compareTwoLists(list1, list4);
        compareTwoLists(list1, list5);
        compareTwoLists(list1, list6);
    }

    private static List<ObjectA> createObjAList(ObjectA... objects) {
        return new ArrayList<>(Arrays.asList(objects));
    }

    private static void compareTwoLists (List<ObjectA> list1, List<ObjectA> list2) {
        SoftAssertions softAssertions = new SoftAssertions();

        if (list1.size() != list2.size()) {
            System.out.println("Размеры коллекций не совпадают");

            return;
        }

        AtomicInteger indexHolder = new AtomicInteger();

        list1.forEach(objectA -> {
            int index = indexHolder.getAndIncrement();
            ObjectA objectToCompare = list2.get(index);
            softAssertions.assertThat(objectA.compareTo(objectToCompare)).isZero();
        });
    }

}
