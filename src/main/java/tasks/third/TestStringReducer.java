package tasks.third;

public class TestStringReducer {

    public static void main(String[] args) {
        StringReducer stringReducer1 = new StringReducer("ffoobar");
        StringReducer stringReducer2 = new StringReducer("fffbbf");
        StringReducer stringReducer3 = new StringReducer("fffff");
        StringReducer stringReducer4 = new StringReducer("fffF");
        StringReducer stringReducer5 = new StringReducer("baab");
        StringReducer stringReducer6 = new StringReducer("11122");
        StringReducer stringReducer7 = new StringReducer("");
        StringReducer stringReducer8 = new StringReducer("ba       ab");

        System.out.println(stringReducer1.reduceLine());
        System.out.println(stringReducer2.reduceLine());
        System.out.println(stringReducer3.reduceLine());
        System.out.println(stringReducer4.reduceLine());
        System.out.println(stringReducer5.reduceLine());
        System.out.println(stringReducer6.reduceLine());
        System.out.println(stringReducer7.reduceLine());
        System.out.println(stringReducer8.reduceLine());
    }
}
