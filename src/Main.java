import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double input = Double.parseDouble(s.nextLine());

        boolean isNeg = input < 0;

        double inputNew = input;

        if(isNeg){
            inputNew *= -1;
            input *= -1;
        }

            while(inputNew - input/inputNew/inputNew > 0.001){
            inputNew = 1.0/3.0 * (2*inputNew + input/inputNew/inputNew);
        }

        if(isNeg){
            inputNew *= -1;
        }

        DecimalFormat df = new DecimalFormat("#.0");
        inputNew = Double.parseDouble(df.format(inputNew));
        System.out.println(inputNew);
    }
}