package command;

public class Main {

    public static void main(String[] args) {


        ProjectorScreen projectorScreen = new ProjectorScreen();
        Command rollUpCommand = new RollUpCommand(projectorScreen);
        Command rollDownCommand = new RollDownCommand(projectorScreen);
        WallButton button1 = new WallButton(rollUpCommand);
        WallButton button2 = new WallButton(rollDownCommand);
        button1.push();
        button2.push();
    }
}
