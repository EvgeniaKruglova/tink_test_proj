package tasks.forth;


class ObjectA {

    private int id;

    private String field;

    private String fieldValue;

    ObjectA(String field, String fieldValue) {
        this.id = (int) (Math.random() * System.identityHashCode(this));
        this.field = field;
        this.fieldValue = fieldValue;
    }

    ObjectA(ObjectA object, String field, String fieldValue) {
        this.id = object.getId();
        this.field = field;
        this.fieldValue = fieldValue;
    }

    int getId() {
        return id;
    }

    String getField() {
        return field;
    }

    String getFieldValue() {
        return fieldValue;
    }
}
