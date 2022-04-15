package src.patternExamples.structural.proxy;

public class RealSubject implements Subject {

    @Override
    public void operation() {
        System.out.println("RealSubject is cool.");
        return;
    }
    
}
