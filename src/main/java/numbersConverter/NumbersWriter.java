package numbersConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Богдан on 12.06.2014.
 */
public class NumbersWriter {
    public void printNumbers() {
        StringBuilder stb = null;
        ListGetter lg = new ListGetter();
        List intsList = lg.getScannedList();
        for (Object s : intsList) {
            NumbersConverter nc = new NumbersConverter();
            stb = new StringBuilder(nc.divFiveAndThree((Integer) intsList.get(0)));

            for (int i = 1; i < intsList.size(); i++ ) {
                stb.append(", ");
                stb.append(nc.divFiveAndThree((Integer) intsList.get(i)));
            }
        }
        System.out.println(stb);
    }


}
