package lotto;

import lotto.view.DosFakeResultView;
import lotto.view.FakeInputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatCode;

class LottoSolutionTest {
    @DisplayName("runTest")
    @CsvSource(value = {
            "10000000000000|1,2,3,4,5,6",
            "10000000000000|1 ,2, 3,4,5 ,6"
    }, delimiter = '|')
    @ParameterizedTest
    public void runTest(long longMoney, String strPrizeNumbers) {
        assertThatCode(() ->
            new LottoSolution(new FakeInputView(longMoney, strPrizeNumbers), new DosFakeResultView()).run()
        ).doesNotThrowAnyException();
    }
}