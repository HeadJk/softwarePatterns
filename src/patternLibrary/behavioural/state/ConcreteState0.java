package src.patternLibrary.behavioural.state;

public class ConcreteState0 extends State {

    @Override
    public void event1(StateContext sc) {
        sc.setCurrentState(StateContext.STATE_1);
    }
    
}
