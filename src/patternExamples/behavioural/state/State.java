package src.patternExamples.behavioural.state;

public abstract class State {

    public abstract void event0(StateContext sc);

    public abstract void event1(StateContext sc);

    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }

}
