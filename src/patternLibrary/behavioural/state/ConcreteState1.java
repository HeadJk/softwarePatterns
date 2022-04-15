package src.patternLibrary.behavioural.state;

public class ConcreteState1 extends State {

    @Override
    public void event0(StateContext sc) {
        sc.setCurrentState(StateContext.STATE_0);
        
    }
    
}
