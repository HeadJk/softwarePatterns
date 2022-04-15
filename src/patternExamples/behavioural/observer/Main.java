package src.patternExamples.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject s1 = new ConcreteSubject();
        ConcreteSubject s2 = new ConcreteSubject();
        
        ConcreteObserver o1 = new ConcreteObserver(s1);
        ConcreteObserver o2 = new ConcreteObserver(s2);

        // Classes observer each other
        s1.attatch(o2);
        s2.attatch(o1);

        System.out.println(s1.getTestData());
        System.out.println(s2.getTestData());
        
        s1.addTestData(1); // Increments s2 using an observer
        System.out.println(s1.getTestData());
        System.out.println(s2.getTestData());
        
    }
}
