package src.patternExamples.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    List<Component> children;

    public Composite() {
        this.children = new ArrayList<Component>();
    }

    @Override
    public void operation() {
        System.out.println("Operation for: " + this.getClass().toString()); // Test functionality
        System.out.println("Children operations:"); // Test functionality
        for(Component c : getChildren()) {
            c.operation();
        }
    }

    public void addChild(Component c) {
        getChildren().add(c);
    }

    public void removeChild(Component c) {
        getChildren().remove(c);
    }

    public Component getChild(int i) {
        return getChildren().get(i);
    }

    private List<Component> getChildren() {
        return children;
    }
    
}
