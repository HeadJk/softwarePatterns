package src.patternExamples.behavioural.command;

public class DisplayHello implements Command {

    @Override
    public void execute() {
        System.out.println("Hello");
    }
    
}
