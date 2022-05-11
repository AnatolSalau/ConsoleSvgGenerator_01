package calculateCoordinat;

public  class CalculateBlack {
    private double blackX,
                   blackY,
                   blackWidth,
                   blackHeight;

    public CalculateBlack(double blackWidth, double blackHeight, double startBlackX, double startBlackY) {
        this.blackX = calculateBlackX(startBlackX,blackWidth);
        this.blackY = calculateBlackY(startBlackY,blackHeight);
        this.blackWidth = blackWidth;
        this.blackHeight = blackHeight;
    }

    private double calculateBlackX(double startBlackX, double blackWidth) {
        return (startBlackX - (blackWidth/2));
    }

    private double calculateBlackY(double startBlackY, double blackHeight) {
        return (startBlackY - blackHeight);
    }

    public double getBlackX() {
        return blackX;
    }

    public double getBlackY() {
        return blackY;
    }

    public double getBlackWidth() {
        return blackWidth;
    }

    public double getBlackHeight() {
        return blackHeight;
    }
}
