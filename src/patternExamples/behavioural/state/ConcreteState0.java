package src.patternExamples.behavioural.state;

public class ConcreteState0 extends State {

    @Override
    public String getName() {
        return "Q0";
    }

    @Override
    public void event0(StateContext sc) {
        return;
    }

    @Override
    public void event1(StateContext sc) {
        sc.setCurrentState(new ConcreteState1());
    }
    
}
