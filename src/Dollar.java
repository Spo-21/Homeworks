public class Dollar extends AbstractCurrency {
    public Dollar(double value) {
        super(value);
    }

    public Dollar() {
    }

    @Override
    public void printValue() {
        System.out.println(getValue() + " $");
    }
}
