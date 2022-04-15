package src.patternExamples.behavioural.command;

public class Invoker {
    public DisplayHello helloCommand = new DisplayHello();
    public DisplayWorld worldCommand = new DisplayWorld();
    public Command currentCommand;

    public Invoker() {
        this.currentCommand = this.helloCommand;
    }

    public void actionePerformed() {
        getCurrentCommand().execute();
        switchCommand();
    }

    private void switchCommand() {
        if(getCurrentCommand() == this.helloCommand) 
            setCurrentCommand(this.worldCommand);
        else {
            setCurrentCommand(this.helloCommand);
        }
    }

    public Command getCurrentCommand() {
        return currentCommand;
    }

    public void setCurrentCommand(Command currentCommand) {
        this.currentCommand = currentCommand;
    }

}
