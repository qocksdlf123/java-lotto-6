package lotto.domain;

import java.util.List;

public class GameData {
    private final Lotto winningNumbers;
    private final int bonusNumber;
    private final List<Lotto> lottos;

    public GameData(Lotto winningNumbers, int bonusNumber, List<Lotto> lottos) {
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
        this.lottos = lottos;
    }

    public Lotto getWinningNumbers() {
        return winningNumbers;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    public List<Lotto> getLottos() {
        return lottos;
    }
}
