package domain;

import exception.IllegalUserInputException;

public class Formula {

    private long operand1;
    private long operand2;
    private Operator operator;

    public Formula(String input) {   // "1 + 5", "/ + *"
        String[] split = input.split(" ");

        if (split.length != 3) {
            throw new IllegalUserInputException("-_-");
        }
        this.operand1 = Long.parseLong(split[0]);
        this.operand2 = Long.parseLong(split[2]);
        this.operator = new Operator(split[1]);
    }

    public long calculate() {
        return operator.calculate(operand1, operand2);
    }
}
