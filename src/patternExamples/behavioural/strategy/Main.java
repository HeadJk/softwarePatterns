package src.patternExamples.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        IdStrategy fbStrategy = new FirebaseIdStrategy("fb-1j58dhwk4u");
        IdStrategy mongoStrategy = new MongoIdStrategy("mongolocal-1j58dhwk4u");

        ConcreteObject obj = new ConcreteObject(fbStrategy);
        obj.setId("qwerty123456");
        System.out.println(obj.getId());
        obj.setStrategy(mongoStrategy);
        System.out.print(obj.getId());

    }
}
