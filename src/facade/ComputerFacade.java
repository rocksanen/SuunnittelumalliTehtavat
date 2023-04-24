package facade;

public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory(1024);
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        long bootSector = 0;
        int sectorSize = 512;
        char[] bootLoader = hardDrive.read(bootSector, sectorSize);
        memory.load(bootSector, bootLoader);
        long bootAddress = 0;
        cpu.jump(bootAddress);
        cpu.execute();
    }
}
