package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ListConverter everyItemNewLineStrategy = new EveryItemNewLineStrategy();
        ListConverter everyOtherItemNewLineStrategy = new EveryOtherItemNewLineStrategy();
        ListConverter everyThirdItemNewLineStrategy = new EveryThirdItemNewLineStrategy();

        List<String> list = new ArrayList<>();
        list.add("Eka itemi");
        list.add("Toka itemi");
        list.add("Kolmas itemi");
        list.add("Neljäs itemi");
        list.add("Viides itemi");

        String result = everyItemNewLineStrategy.listToString(list);
        System.out.println("Jokainen omalla rivillä:");
        System.out.println(result);

        result = everyOtherItemNewLineStrategy.listToString(list);
        System.out.println("Joka toisen jälkeen rivin vaihto:");
        System.out.println(result);


        result = everyThirdItemNewLineStrategy.listToString(list);
        System.out.println("Joka kolmannen jälkeen rivin vaihto:");
        System.out.println(result);
    }


}
