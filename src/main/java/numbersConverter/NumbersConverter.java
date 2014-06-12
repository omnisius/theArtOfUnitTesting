package numbersConverter;

/**
 * Created by Богдан on 12.06.2014.
 */
public class NumbersConverter {
    StringBuilder str;
    private static final int THREE = 3;
    private static final int FIVE = 5;

    public StringBuilder divThree(int i){
        if (((i % THREE) == 0) && (i >= THREE)){
            str = new StringBuilder("Fizz");
        }  else {
            str = new StringBuilder(String.valueOf(i));
        }
        return str;
    }

    public StringBuilder divFiveAndThree(int i){
        str = divThree(i);
        if (((i % FIVE) == 0)&&(i >= FIVE)&&("Fizz".equals(str.toString()))) {
            str.append("Buzz");
        } else if (((i % FIVE) == 0)&&(i >= FIVE)){
            str = new StringBuilder("Buzz");
        }else if (!("Fizz".equals(str.toString()))){
            str = new StringBuilder(String.valueOf(i));
        } else{
            str = str;
        }
    return str;
    }
}
