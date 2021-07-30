package lotto.util.number;

public final class MultiplicationNumber extends CalculationNumber {
    public MultiplicationNumber(Number leftNumber, Number rightNumber) {
        super(leftNumber, rightNumber);
    }

    @Override
    public int intValue() {
        return leftNumber.intValue() * rightNumber.intValue();
    }

    @Override
    public long longValue() {
        return leftNumber.longValue() * rightNumber.longValue();
    }

    @Override
    public float floatValue() {
        return leftNumber.floatValue() * rightNumber.floatValue();
    }

    @Override
    public double doubleValue() {
        return leftNumber.doubleValue() * rightNumber.doubleValue();
    }
}