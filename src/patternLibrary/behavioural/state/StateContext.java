package src.patternLibrary.behavioural.state;

public class StateContext {

    public static final State STATE_0 = new ConcreteState0();
    public static final State STATE_1 = new ConcreteState1();
    private State currentState = STATE_0;

    public void event0() {
        getCurrentState().event0(this);
    }

    public void event1() {
        getCurrentState().event1(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

}
