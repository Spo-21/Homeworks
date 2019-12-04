public class PoundSterling extends AbstractCurrency {
    public PoundSterling(double value) {
        super(value);
    }

    public PoundSterling() {
    }

    @Override
    public void printValue() {
        System.out.println(getValue() + " P");
    }
}
