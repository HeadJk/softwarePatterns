package src.patternLibrary.creational.builder;

public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildField1() {
        getProduct().setField1("ConcreteBuilderField1");
    }

    @Override
    public void buildField2() {
        getProduct().setField2("ConcreteBuilderField2");
        
    }

    public Product getProduct() {
        return this.product;
    }

}