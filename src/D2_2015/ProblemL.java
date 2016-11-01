package D2_2015;
import java.util.*;

/**
 * Created by Jonathan on 10/31/2016.
 */

public class ProblemL {
    public static void main(String[] args) {
        // worth is W dollars
        // winning v dollars gives "ln(1 + v/W)" units of happiness
        // expected happiness = <Sum>v * P(v) * ln (1+ v/W)
        //  where P(v) is probability that you'll win v dollars, and the summation is taken over all possible values of v
        // if you attempt the i_th question, your chances of being correct are p_i
        //
        // first line of input contains n and W (1 <= n <= 10^5; 1 <= W <= 10^6).
        // n = number of questions
        // W = worth
        // sample args:
            // 1 4000
            // unsafe 0.5 5000

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int W = console.nextInt();
        double D = 0; // payout in dollars that makes you happy

        for (int i = 0; i < n; i++) {
            String question = console.next();
            double probabilityV = console.nextDouble();
            int v = console.nextInt();

            D += (probabilityV * Math.log(1 + v/W));
        }

        System.out.println("$" + D);

    }

}
