package command;

public class RollUpCommand implements Command{

    private ProjectorScreen projectorScreen;

    public RollUpCommand(ProjectorScreen projectorScreen) {
        this.projectorScreen = projectorScreen;
    }

    @Override
    public void execute() {
        projectorScreen.rollUp();
    }


}
