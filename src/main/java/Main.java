import domain.Formula;
import domain.Operator;
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
                Formula formula = new Formula(input);
                System.out.println("result : " + formula.calculate());
            } catch (NumberFormatException e) {
                throw new IllegalUserInputException("-_-");
            }
        }
    }
}
