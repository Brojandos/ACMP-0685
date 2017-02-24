import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 24.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte[] prices = {input.nextByte(), input.nextByte(), input.nextByte()};
        byte[] weights = {input.nextByte(), input.nextByte(), input.nextByte()};
        Arrays.sort(prices);
        Arrays.sort(weights);
        System.out.println(prices[0] * weights[0] + prices[1] * weights[1] + prices[2] * weights[2]);
    }
}