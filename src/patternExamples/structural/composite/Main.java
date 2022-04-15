package src.patternExamples.structural.composite;

public class Main {
    public static void main(String[] args) {
        Leaf l1 = new Leaf();
        Leaf l2 = new Leaf();
        Leaf l3 = new Leaf();

        Composite c1 = new Composite();
        c1.addChild(l1);
        c1.addChild(l2);

        Composite c2 = new Composite();
        c2.addChild(c1);
        c2.addChild(l3);

        c2.operation();
    }
}
