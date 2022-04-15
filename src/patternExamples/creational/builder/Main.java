package src.patternExamples.creational.builder;

public class Main {

    public static void main(String[] args) {
        ConcreteBuilder cb = new ConcreteBuilder();
        Director d = new Director(cb);
        d.construct();

        Product p = cb.getProduct();
        System.out.println(p);
    }

}
