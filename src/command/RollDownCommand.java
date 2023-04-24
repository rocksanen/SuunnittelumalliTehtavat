package command;

public class RollDownCommand implements Command{

    private ProjectorScreen projectorScreen;

    public RollDownCommand(ProjectorScreen projectorScreen) {
        this.projectorScreen = projectorScreen;
    }

    @Override
    public void execute() {
        projectorScreen.rollDown();
    }
}
