package src.patternLibrary.creational.factory;

// Add similary functionality between creators here
public abstract class AbstractCreator {

    public abstract AbstractProduct makeProduct();

    // An example of desired functionality
    public void performOperation() {
        AbstractProduct ap = makeProduct();
        ap.operation();
    }

}
