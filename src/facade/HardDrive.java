package facade;

public class HardDrive {

    public char[] read(long lba, int size) {
        System.out.println("HardDrive: Read " + size + " bytes from LBA " + lba);
        // Generate some random data for simulation purposes
        char[] data = new char[size];
        for (int i = 0; i < size; i++) {
            data[i] = (char)('a' + Math.random() * ('z' - 'a' + 1));
        }
        return data;
    }
}
