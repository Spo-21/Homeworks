public class Ruble extends AbstractCurrency {
    public Ruble(double value) {
        super(value);
    }

    public Ruble() {
    }

    @Override
    public void printValue() {
        System.out.println(getValue() + " R");
    }
}
