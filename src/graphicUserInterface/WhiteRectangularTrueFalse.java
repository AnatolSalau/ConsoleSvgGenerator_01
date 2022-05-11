package graphicUserInterface;

public enum WhiteRectangularTrueFalse {
    P6 (true)    , P5 (true)  ,
    P7 (true)    , P4 (true)  ,
    P8 (true)    , P3 (true)  ,
    P9 (true)    , P2 (true)  ,
    P10(true)    , P1 (true)  ;

    private boolean trueFalse;

    WhiteRectangularTrueFalse(boolean trueFalse) {
        this.trueFalse = trueFalse;
    }

    public boolean getTrueFalse() {
        return trueFalse;
    }

    public void setTrueFalse(boolean trueFalse) {
        this.trueFalse = trueFalse;
    }
}
