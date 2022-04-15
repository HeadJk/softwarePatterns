package src.patternExamples.behavioural.strategy;

public class ConcreteObject {
    private String id;
    private IdStrategy strategy;

    public ConcreteObject(IdStrategy s) {
        this.strategy = s;
    }

    public String getId() {
        return strategy.getId(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IdStrategy strategy) {
        this.strategy = strategy;
    }
}
