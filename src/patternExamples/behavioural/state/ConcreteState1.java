package src.patternExamples.behavioural.state;

public class ConcreteState1 extends State {

    @Override
    public String getName() {
        return "Q1";
    }

    @Override
    public void event0(StateContext sc) {
        sc.setCurrentState(new ConcreteState0());
        
    }

    @Override
    public void event1(StateContext sc) {
        return;
    }
    
}
