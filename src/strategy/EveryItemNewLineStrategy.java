package strategy;

import java.util.Iterator;
import java.util.List;

public class EveryItemNewLineStrategy implements ListConverter {

    @Override
    public String listToString(List<?> list) {

        StringBuilder sb = new StringBuilder();

        Iterator<?> it = list.iterator();

        while (it.hasNext()) {

            sb.append(it.next().toString());

            if (it.hasNext()) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
