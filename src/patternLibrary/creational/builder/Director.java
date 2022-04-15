package src.patternLibrary.creational.builder;

public class Director {

    private Builder builder;

    public Director(Builder b) {
        this.builder = b;
    }

    public void construct() {
        getBuilder().buildField1();
        getBuilder().buildField2();
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

}
