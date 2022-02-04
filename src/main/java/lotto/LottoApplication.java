package lotto;

import java.util.List;
import lotto.domain.Lotto;
import lotto.domain.LottoRaffle;
import lotto.domain.Lottos;
import lotto.domain.WinningLotto;
import lotto.view.InputView;
import lotto.view.ResultView;

public class LottoApplication {

    public static void main(String[] args) {
        final int money = InputView.inputMoney();
        final int lottoCount = money / 1000;
        ResultView.printLottoCount(lottoCount);

        final Lottos lottos = new Lottos(lottoCount);
        ResultView.printLottos(lottos);

        final List<Integer> winningNumbers = InputView.inputLastWinningNumbers();
        final Integer bonusNumber = InputView.inputBonusNumber(winningNumbers);

        final LottoRaffle lottoRaffle = new LottoRaffle(new WinningLotto(winningNumbers, bonusNumber));
        for(Lotto lotto: lottos.getLottos()) {
            lottoRaffle.compareLotto(lotto);
        }
        final List<Integer> results = lottoRaffle.getResults();
        ResultView.printLottoResult(results, money);
    }
}
