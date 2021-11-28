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
        // 덧셈 테스트
        Formula formula1 = new Formula("2 + 3");
        long result1 = formula1.calculate();
        assertThat(result1).isEqualTo(5);

        // 뺄셈 테스트
        Formula formula2 = new Formula("3 - 2");
        long result2 = formula2.calculate();
        assertThat(result2).isEqualTo(1);

        // 곱셈 테스트
        Formula formula3 = new Formula("2 * 3");
        long result3 = formula3.calculate();
        assertThat(result3).isEqualTo(6);

        // 나눗셈 테스트 (10 / 2)
        Formula formula4 = new Formula("10 / 2");
        long result4 = formula4.calculate();
        assertThat(result4).isEqualTo(5);

        // 나눗셈 테스트 (10 / 0) -> 이때 예외 발생해야함
        Formula formula5 = new Formula("10 / 0");
        long result5 = formula5.calculate();
        assertThat(result5).isEqualTo(1);
    }
}
