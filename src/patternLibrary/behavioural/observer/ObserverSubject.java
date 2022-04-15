package src.patternLibrary.behavioural.observer;

import java.util.List;
import java.util.ArrayList;

public abstract class ObserverSubject {
    List<Observer> observers;

    public ObserverSubject() {
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
