package src.patternExamples.creational.factory;

public class ConcreteCreator2 extends AbstractCreator {

    @Override
    public AbstractProduct makeProduct() {
        return new ConcreteProduct2();
    }
}
