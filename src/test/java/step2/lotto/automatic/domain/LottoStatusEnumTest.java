package step2.lotto.automatic.domain;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoStatusEnumTest {
    private static LottoStatusEnum enumTest;

    @Test
    public void 제대로_COUNT가_증가했즈지() {
        LottoStatusEnum enumTest = LottoStatusEnum.findByPrice(4);
        enumTest.addWinningCount();
        assertThat(enumTest.getWinningCount()).isEqualTo(1);
    }

    @Test
    public void 제대로_RANK를_입력했는지() {
        assertThatThrownBy(() ->
                enumTest = LottoStatusEnum.findByPrice(1000)
        ).isInstanceOf(RuntimeException.class);
    }
}
