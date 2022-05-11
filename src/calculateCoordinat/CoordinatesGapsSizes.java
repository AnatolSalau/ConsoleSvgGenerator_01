package calculateCoordinat;

public enum CoordinatesGapsSizes {
    BLACK_WIDTH(5.4),
    BLACK_HEIGHT(18),
    BLACK_START_X(102.7),
    BLACK_START_Y(115),
    WHITE_WIDTH(1.05),
    WHITE_HEIGHT(2),
    GAP_HORISONTAL(0.38),
    GAP_VERTICAL(2),
    GAP_BETWEEN_WHITE_RECTANGULAR(3),
    QUANTITY_LINE_WHITE_RECTANGULAR(5);

    private double value;

    CoordinatesGapsSizes(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
