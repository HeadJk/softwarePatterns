package src.patternExamples.behavioural.state;

public class StateContext {

    private static final State INITIAL_STATE = new ConcreteState0();
    private State currentState = INITIAL_STATE;

    public void event0() {
        getCurrentState().event0(this);
        printState();
    }

    public void event1() {
        getCurrentState().event1(this);
        printState();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    private void printState() {
        System.out.println(getCurrentState());
    }

}
