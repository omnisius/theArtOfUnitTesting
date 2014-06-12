package numbersConverter;

/**
 * Created by Богдан on 12.06.2014.
 */
public class NumbersConverter {
    String str;
    private static final int THREE = 3;
    private static final int FIVE = 5;

    public String divThree(int i){
        if (((i % THREE) == 0) && (i >= THREE)){
            str = "Fizz";
        }  else {
            str = String.valueOf(i);
        }
        return str;
    }

    public String divFiveAndThree(int i){
        str = divThree(i);
        if (((i % FIVE) == 0)&&(i >= FIVE)&&("Fizz".equals(str))) {
            str = new StringBuilder(str).append("Buzz").toString();
        } else if (((i % FIVE) == 0)&&(i >= FIVE)){
            str = "Buzz";
        }else if (!("Fizz".equals(str))){
            str = String.valueOf(i);
        }
    return str;
    }
}
