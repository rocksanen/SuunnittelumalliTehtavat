package strategy;

import java.util.List;

public class EveryOtherItemNewLineStrategy implements ListConverter{


    @Override
    public String listToString(List<?> list) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {

            sb.append(list.get(i).toString()).append(" ");
            if (i % 2 == 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
