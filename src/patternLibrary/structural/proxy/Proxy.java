package src.patternLibrary.structural.proxy;

public class Proxy implements Subject {

    private RealSubject subject;

    public Proxy(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void operation() {
        // Add proxy functionality
        getSubject().operation();
    }

    public RealSubject getSubject() {
        return subject;
    }
    
}
