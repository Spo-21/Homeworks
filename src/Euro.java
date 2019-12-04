public class Euro extends AbstractCurrency {
    public Euro(double value) {
        super(value);
    }

    public Euro() {
    }

    @Override
    public void printValue() {
        System.out.println(getValue() + " E");
    }
}
