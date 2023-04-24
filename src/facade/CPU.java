package facade;

public class CPU {

    public void freeze() {
        System.out.println("CPU: Freeze");
    }

    public void jump(long position) {
        System.out.println("CPU: Jump to " + position);
    }

    public void execute() {
        System.out.println("CPU: Execute");
    }
}
