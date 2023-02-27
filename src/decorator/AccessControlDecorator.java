package decorator;

import java.util.Scanner;

public class AccessControlDecorator implements IDataStructure {

    //jep
    private final IDataStructure dataStructure;
    private final String password;

    public AccessControlDecorator(IDataStructure dataStructure, String password) {
        this.dataStructure = dataStructure;
        this.password = password;
    }

    private void authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna salasana:");
        String input = scanner.nextLine();
        if (!input.equals(password)) {
            throw new RuntimeException("Ei muuten pelle onnistu!");
        }
    }


    @Override
    public void addData(String data) {

        authenticate();
        dataStructure.addData(data);
    }

    @Override
    public void removeData(String data) {

        authenticate();
        dataStructure.removeData(data);
    }

    @Override
    public void printData() {

        authenticate();
        dataStructure.printData();
    }
}
