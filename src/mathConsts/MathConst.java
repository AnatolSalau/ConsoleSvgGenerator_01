package mathConsts;

public enum MathConst {
    COS45_SIN45(0.7071067);

    private double val;

    MathConst(double val) {
        this.val = val;
    }

    public double getVal() {
        return val;
    }
}
