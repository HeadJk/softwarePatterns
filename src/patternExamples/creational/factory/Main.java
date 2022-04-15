package src.patternExamples.creational.factory;

public class Main {
    public static void main(String[] args) {
        AbstractCreator ac1 = new ConcreteCreator1();
        AbstractProduct ap1 = ac1.makeProduct();

        AbstractCreator ac2 = new ConcreteCreator2();
        AbstractProduct ap2 = ac2.makeProduct();

        System.out.println(ap1.toString());
        System.out.println(ap2.toString());
    }
}
