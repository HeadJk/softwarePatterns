package src.patternExamples.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Subject s = new Proxy(new RealSubject());
        s.operation();
    }
}
