package calculateCoordinat;

import mathConsts.MathConst;

public class CalculateGapHorisontalTwo {

    private double gapHorisontalTwo_X;

    public CalculateGapHorisontalTwo() {
        gapHorisontalTwo_X = 0;
    }

    private double calculateAnchorLeftBottomX (double blackWidth, double startBlackX) {
        return startBlackX - (blackWidth/2);
    }
    private double calculateAnchorRightBottomX (double blackWidth, double startBlackX) {
        return startBlackX + (blackWidth/2);
    }
    private double calculateWhiteX(double anchorLeftBottomX, double gapHorisontal) {
        return anchorLeftBottomX + gapHorisontal;

    }

    public double calculateGapHorisontalTwo_X(double whiteWidth,
                                               double whiteHeight,
                                               double blackWidth,
                                               double startBlackX,
                                               double gapHorisontal
    ) {
        double anchorLeftBottomX = calculateAnchorLeftBottomX(blackWidth, startBlackX);
//        System.out.printf("anchorLeftBottomX: %f\n",anchorLeftBottomX);
        double startX = calculateWhiteX(anchorLeftBottomX,gapHorisontal);
//        System.out.printf("startX: %f\n",startX);
        double projectionWidthToX = whiteWidth * MathConst.COS45_SIN45.getVal();
//        System.out.printf("projectionWidthToX: %f\n",projectionWidthToX);
        double projectionHeightToX = whiteHeight * MathConst.COS45_SIN45.getVal();
//        System.out.printf("projectionHeightToX: %f\n",projectionHeightToX);

        double anchorRightBottomX = calculateAnchorRightBottomX(blackWidth, startBlackX);
//        System.out.printf("anchorRightBottomX: %f\n",anchorRightBottomX);
        double result = blackWidth - gapHorisontal - projectionHeightToX - projectionWidthToX;
//        System.out.printf("gapHorisontalTwo_X(result): %f\n",result);
        this.gapHorisontalTwo_X = result;
        return result;
    }

    public double getGapHorisontalTwo_X() {
        return gapHorisontalTwo_X;
    }
}



