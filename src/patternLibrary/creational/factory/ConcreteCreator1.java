package src.patternLibrary.creational.factory;

public class ConcreteCreator1 extends AbstractCreator {

    @Override
    public AbstractProduct makeProduct() {
        return new ConcreteProduct1();
    }
    
}
