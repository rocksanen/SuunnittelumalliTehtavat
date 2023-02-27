package decorator;

import java.util.ArrayList;

public class ConcreteDataStructure implements IDataStructure {

    //jep
    private final ArrayList<String> dataList;


    public ConcreteDataStructure() {

        dataList = new ArrayList<>();
    }

    @Override
    public void addData(String data) {

        dataList.add(data);
    }

    @Override
    public void removeData(String data) {

        dataList.remove(data);
    }

    @Override
    public void printData() {

        System.out.println(dataList);
    }
}
