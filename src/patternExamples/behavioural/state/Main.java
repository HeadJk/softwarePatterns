package src.patternExamples.behavioural.state;

public class Main {
    public static void main(String[] args) {
        StateContext sc = new StateContext();
        sc.event0();
        sc.event1();
        sc.event1();
        sc.event0();
    }
}
