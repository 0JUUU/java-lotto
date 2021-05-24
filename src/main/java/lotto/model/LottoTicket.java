package lotto.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LottoTicket {

	private final List<LottoNumbers> lottoNumbersGroup;

	public LottoTicket(List<LottoNumbers> lottoNumbersGroup) {
		this.lottoNumbersGroup = Collections.unmodifiableList(lottoNumbersGroup);
	}

	public List<List<Integer>> getLottoNumbersGroup() {
		return lottoNumbersGroup.stream()
			.map(LottoNumbers::getNumbers)
			.collect(Collectors.toList());
	}

	public LottoResult match(WinningNumbers winningNumbers) {
		LottoResult lottoResult = new LottoResult();
		for (LottoNumbers lottoNumbers : lottoNumbersGroup) {
			LottoRank lottoRank = lottoNumbers.match(winningNumbers);
			lottoResult.increaseCountOfRank(lottoRank);
		}
		return lottoResult;
	}
}