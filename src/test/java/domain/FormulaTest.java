package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FormulaTest {

    @Test
    void constructor() {
        String normalInput = "2 + 3";
        assertThat(new Formula(normalInput)).isInstanceOf(Formula.class);

        String wrongInput = "* + 3";
        assertThatThrownBy(() -> new Formula(wrongInput));
    }
    @Test
    void calculate()
    {
        Formula formula = new Formula("2 + 3");
        long result = formula.calculate();
        assertThat(result).isEqualTo(5);
    }
}
