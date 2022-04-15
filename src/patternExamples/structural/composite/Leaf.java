package src.patternExamples.structural.composite;

public class Leaf extends Component {

    @Override
    public void operation() {
        System.out.println("Operation for: " + this.getClass().toString()); // Test functionality
        return;
    }
    
}
