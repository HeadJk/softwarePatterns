package src.patternExamples.creational.factory;

// Add similary functionality between products here
public abstract class AbstractProduct {

    public abstract int getClassNumber();

    @Override
    public String toString() {
        return "The class number is " + Integer.toString(getClassNumber());
    }
    
}
