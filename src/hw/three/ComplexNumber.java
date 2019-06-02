package hw.three;

public class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplexNumber) {
            return Double.compare(this.getIm(), ((ComplexNumber) obj).im) == 0
                    && Double.compare(this.getRe(), ((ComplexNumber) obj).re) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (this.getIm() * 100000 + this.getRe() * 100000);
    }
}
