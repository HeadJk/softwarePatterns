package src.patternExamples.behavioural.observer;

public class ConcreteObserver implements Observer{
    ConcreteSubject s;

    public ConcreteObserver(ConcreteSubject s) {
        this.s = s;
    }

    public void update() {
        s.addTestDataHelper(1);
    }
}
