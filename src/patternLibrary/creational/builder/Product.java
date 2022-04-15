package src.patternLibrary.creational.builder;

public class Product {
 
    private String field1;
    private String field2;

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return field1 + " " + field2;
    }
 
}
