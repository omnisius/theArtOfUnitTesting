package numbersConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Богдан on 13.06.2014.
 */
public class ListGetter {
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
