package facade;

public class Memory {

    private char[] data;

    public Memory(int size) {
        this.data = new char[size];
    }

    public void load(long position, char[] data) {
        System.out.println("Memory: Load " + data.length + " bytes to address " + position);
        for (int i = 0; i < data.length; i++) {
            this.data[(int)position + i] = data[i];
        }
    }

    public char[] read(long position, int size) {
        System.out.println("Memory: Read " + size + " bytes from address " + position);
        char[] data = new char[size];
        for (int i = 0; i < size; i++) {
            data[i] = this.data[(int)position + i];
        }
        return data;
    }
}
