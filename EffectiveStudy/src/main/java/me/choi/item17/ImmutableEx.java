package me.choi.item17;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 11/02/2020
 * Time : 12:50 오전
 */
public final class ImmutableEx {
    private final double re;
    private final double im;

    public static final ImmutableEx ZERO = new ImmutableEx(0,0);
    public static final ImmutableEx ONE = new ImmutableEx(1,0);
    public static final ImmutableEx I = new ImmutableEx(0,1);

    public ImmutableEx(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart()      { return re; }
    public double imaginaryPart() { return im; }

    public ImmutableEx plus(ImmutableEx c) {
        return new ImmutableEx(re + c.re, im + c.im);
    }

    // 코드 17-2 정적 팩터리(private 생성자와 함께 사용해야 한다.) (110-111쪽)
    public static ImmutableEx valueOf(double re, double im) {
        return new ImmutableEx(re, im);
    }

    public ImmutableEx minus(ImmutableEx c) {
        return new ImmutableEx(re - c.re, im - c.im);
    }

    public ImmutableEx times(ImmutableEx c) {
        return new ImmutableEx(re * c.re - im * c.im,
                re * c.im + im * c.re);
    }

    public ImmutableEx dividedBy(ImmutableEx c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new ImmutableEx((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }

    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ImmutableEx))
            return false;
        ImmutableEx c = (ImmutableEx) o;

        // == 대신 compare를 사용하는 이유는 63쪽을 확인하라.
        return Double.compare(c.re, re) == 0
                && Double.compare(c.im, im) == 0;
    }
    @Override public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
