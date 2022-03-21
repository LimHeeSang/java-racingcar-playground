package racingcar;

public class TryNo {
    private int tryNo;

    public TryNo(int tryNo) {
        this.tryNo = tryNo;
    }

    public boolean isZero() {
        return tryNo == 0;
    }

    public void decrease() {
        tryNo--;
    }
}
