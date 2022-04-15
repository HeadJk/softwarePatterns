package src.patternExamples.behavioural.observer;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {
    List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void attatch(Observer o) {
        this.observers.add(o);
    }

    public void detatch(Observer o) {
        this.observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o : this.observers)
            o.update();
    }
}
