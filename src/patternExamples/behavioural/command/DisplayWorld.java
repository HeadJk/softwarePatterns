package src.patternExamples.behavioural.command;

public class DisplayWorld implements Command {

    @Override
    public void execute() {
        System.out.println("World");
    }
    
}
