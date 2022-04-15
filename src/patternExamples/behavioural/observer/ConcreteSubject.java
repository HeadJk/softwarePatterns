package src.patternExamples.behavioural.observer;

public class ConcreteSubject extends Subject {
    int testData = 0;

    public void addTestDataHelper(int addOperand) {
        this.testData = this.testData + addOperand;
    }

    public void addTestData(int addOperand) {
        addTestDataHelper(addOperand);
        notifyObservers(); // Updates observers whenever data is changed
    }

    public int getTestData() {
        return testData;
    }
}
