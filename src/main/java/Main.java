import domain.Operand;
import exception.IllegalUserInputException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true) {
            try {
                System.out.println("If you want to end, enter \"exit\".");
                System.out.print("enter formula\n>> ");
                String input = br.readLine();
                if (input.equals("exit")) {
                    System.out.println("bye");
                    break;
                }
                System.out.println("result : " + calculate(input));
            } catch (NumberFormatException e) {
                throw new IllegalUserInputException("-_-");
            }
        }
    }

    private static long calculate(String input)
    {
        String[] split = input.split(" ");

        if (split.length != 3) {
            throw new IllegalUserInputException("-_-");
        }
        long operand1 = Long.parseLong(split[0]);
        long operand2 = Long.parseLong(split[2]);
        Operand operand = new Operand(split[1]);

        return operand.calculate(operand1, operand2);
    }
}
