package task1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan, last_digit, second_to_last_digit;
        double roubles;
        String line_ending;
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.print("Введите сумму в китайских юанях: ");
            yuan = input.nextInt();
            last_digit = yuan % 10;
            second_to_last_digit = (yuan / 10) % 10;
            if (last_digit == 1 && second_to_last_digit != 1)
            {
                line_ending = "китайский юань";
            }
            else if (last_digit >= 2 && last_digit <= 4 && second_to_last_digit != 1) {
                line_ending = "китайских юаня";
            }
            else {
                line_ending = "китайских юаней";
            }
            System.out.print(yuan + " " + line_ending);

            roubles = ROUBLES_PER_YUAN * yuan;
            DecimalFormat df = new DecimalFormat("#.##");
            String output = "\nСумма в российских рублях: " + df.format(roubles);
            System.out.println(output);
            System.out.println();
        }

    }
}
