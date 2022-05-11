package calculateCoordinat;


import mathConsts.MathConst;

public class CalculateWhiteRectangular {
    public static int count;
    private double      whiteX,
                        whiteY,
                        whiteWidth,
                        whiteHeight,

                        circleOneX,
                        circleOneY,
                        circleOneR,

                        circleTwoX,
                    circleTwoY,
                    circleTwoR,

                        anchorLeftTopX,
                        anchorLeftTopY,
                        anchorLeftBottomX,
                        anchorLeftBottomY,
                        gapHorisontal,
                        gapVertical;

    public CalculateWhiteRectangular(double blackWidth,
                                     double blackHeight,
                                     double startBlackX,
                                     double startBlackY,
                                     double gapHorisontal,
                                     double gapVertical,
                                     double whiteHeight,
                                     double whiteWidth
                                ) {
        //Считаем координаты нижнего и верхнего якоря слева
        this.anchorLeftTopX = calculateAnchorTopX(blackWidth,startBlackX);
        this.anchorLeftTopY = calculateAnchorTopY(blackHeight,startBlackY);
        this.anchorLeftBottomX = calculateAnchorLeftBottomX(blackWidth,startBlackX);
        this.anchorLeftBottomY = calculateAnchorLeftBottomY(startBlackY);

        //задаем длины отступов от края черного прямоугольника
        this.gapHorisontal = gapHorisontal;
        this.gapVertical = gapVertical;

        //считаем координаты левого угла, ширину и высоту прямогольника белого
        this.whiteX = calculateWhiteX();
        this.whiteY = calculateWhiteY();
        this.whiteHeight = whiteHeight;
        this.whiteWidth = whiteWidth;

        //считаем координаты центра верхнего круга и радиус
        this.circleOneX = calculateCircleOneX();
        this.circleOneY = calculateCircleOneY();
        this.circleOneR = calculateCircleOneR();

        //считаем координаты центра нижнего круга и радиус
        this.circleTwoX = calculateCircleTwoX();
        this.circleTwoY = calculateCircleTwoY();
        this.circleTwoR = calculateCircleTwoR();

    }

    public void reCalculateWhiteRectangular(double blackWidth,
                                            double blackHeight,
                                            double startBlackX,
                                            double startBlackY,
                                            double gapHorisontal,
                                            double gapVertical,
                                            double whiteHeight,
                                            double whiteWidth
    ) {
        //Считаем координаты нижнего и верхнего якоря слева
        this.anchorLeftTopX = calculateAnchorTopX(blackWidth,startBlackX);
        this.anchorLeftTopY = calculateAnchorTopY(blackHeight,startBlackY);
        this.anchorLeftBottomX = calculateAnchorLeftBottomX(blackWidth,startBlackX);
        this.anchorLeftBottomY = calculateAnchorLeftBottomY(startBlackY);

        //задаем длины отступов от края черного прямоугольника
        this.gapHorisontal = gapHorisontal;
        this.gapVertical = gapVertical;

        //считаем координаты левого угла, ширину и высоту прямогольника белого
        this.whiteX = calculateWhiteX();
        this.whiteY = calculateWhiteY();
        this.whiteHeight = whiteHeight;
        this.whiteWidth = whiteWidth;

        //считаем координаты центра верхнего круга и радиус
        this.circleOneX = calculateCircleOneX();
        this.circleOneY = calculateCircleOneY();
        this.circleOneR = calculateCircleOneR();

        //считаем координаты центра нижнего круга и радиус
        this.circleTwoX = calculateCircleTwoX();
        this.circleTwoY = calculateCircleTwoY();
        this.circleTwoR = calculateCircleTwoR();

    }

    private double calculateAnchorTopX (double blackWidth, double startBlackX) {
        return startBlackX - (blackWidth/2);
    }

    private double calculateAnchorTopY (double blackHeight, double startBlackY) {
        return startBlackY - blackHeight;
    }

    private double calculateAnchorLeftBottomX (double blackWidth, double startBlackX) {
        return startBlackX - (blackWidth/2);
    }

    private double calculateAnchorLeftBottomY (double startBlackY) {
        return startBlackY;
    }

    private double calculateWhiteX() {
        return this.anchorLeftBottomX + this.gapHorisontal;

    }

    private double calculateWhiteY() {
        return this.anchorLeftBottomY - this.gapVertical;
    }

    private double calculateCircleOneX() {
        double shiftX = (whiteWidth/2) * MathConst.COS45_SIN45.getVal();
        return whiteX + shiftX;
    }

    private double calculateCircleOneY() {
        double shiftY = (whiteWidth/2) * MathConst.COS45_SIN45.getVal();
        return whiteY - shiftY;
    }

    private double calculateCircleOneR() {
        return this.whiteWidth/2;
    }

    private double calculateCircleTwoX() {
        double shiftX = whiteHeight * MathConst.COS45_SIN45.getVal();
        double result = circleOneX + shiftX;
        return result;
    }

    private double calculateCircleTwoY() {
        double shiftY = whiteHeight * MathConst.COS45_SIN45.getVal();
        double result = circleOneY + shiftY;
        return result;
    }

    private double calculateCircleTwoR() {
        return this.whiteWidth/2;
    }

    public void printToString() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\nwhite rectangular coordinates{" +
                "whiteX=" + whiteX +
                ", whiteY=" + whiteY +
                ", whiteWidth=" + whiteWidth +
                ", whiteHeight=" + whiteHeight +
                ", circleOneX=" + circleOneX +
                ", circleOneY=" + circleOneY +
                ", circleOneR=" + circleOneR +
                ", circleTwoX=" + circleTwoX +
                ", circleTwoY=" + circleTwoY +
                ", circleTwoR=" + circleTwoR +
                ", anchorLeftTopX=" + anchorLeftTopX +
                ", anchorLeftTopY=" + anchorLeftTopY +
                ", anchorLeftBottomX=" + anchorLeftBottomX +
                ", anchorLeftBottomY=" + anchorLeftBottomY +
                ", gapHorisontal=" + gapHorisontal +
                ", gapVertical=" + gapVertical +
                '}';
    }

    public double getWhiteX() {
        return whiteX;
    }

    public double getWhiteY() {
        return whiteY;
    }

    public double getCircleOneX() {
        return circleOneX;
    }

    public double getCircleOneY() {
        return circleOneY;
    }

    public double getCircleOneR() {
        return circleOneR;
    }

    public double getCircleTwoX() {
        return circleTwoX;
    }

    public double getCircleTwoY() {
        return circleTwoY;
    }

    public double getCircleTwoR() {
        return circleTwoR;
    }


}
