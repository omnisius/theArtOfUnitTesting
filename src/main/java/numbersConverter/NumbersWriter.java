package numbersConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Богдан on 12.06.2014.
 */
public class NumbersWriter {
    public void printNumbers() {
        List intsList = getScannedList();
        for (Object s : intsList) {
            NumbersConverter nc = new NumbersConverter();
            StringBuilder stb = new StringBuilder(nc.divFiveAndThree((Integer) intsList.get(0)));

            for (int i = 1; i < intsList.size(); i++ ) {
                stb.append(", ");
                stb.append(nc.divFiveAndThree((Integer) intsList.get(i)));
            }
            System.out.println(stb);
        }
    }

    public List getScannedList() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intsList = new ArrayList<Integer>();
        System.out.println("Enter integer numbers:");
        try {
            String[] strs = scanner.nextLine().split(" ");
            for (String str : strs) {
                Integer i = new Integer(str);
                intsList.add(i);
            }
            return intsList;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            scanner.close();
        }
    }
}
