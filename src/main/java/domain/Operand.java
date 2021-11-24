package domain;

public class Operand {

    private final String value;

    public Operand(String input) {
        if (!"+".equals(input) && !"-".equals(input) && !"*".equals(input) && !"/".equals(input)) {
            throw new IllegalArgumentException("input format is wrong.");
        }
        this.value = input;
    }

    public long calculate(long operand1, long operand2) {
        if ("+".equals(value)) {
            return operand1 + operand2;
        }
        else if("-".equals(value))
        {
            return operand1 - operand2;
        }
        else if("*".equals(value))
        {
            return operand1 * operand2;
        }
        else if("/".equals(value))
        {
            return operand1 / operand2;
        }
        throw new IllegalStateException("illegal status!!!");
    }
}
