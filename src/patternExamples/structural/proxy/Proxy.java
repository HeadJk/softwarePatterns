package src.patternExamples.structural.proxy;

public class Proxy implements Subject {

    private RealSubject subject;

    public Proxy(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void operation() {
        System.out.println("Proxy and ");
        getSubject().operation();
    }

    public RealSubject getSubject() {
        return subject;
    }
    
}
