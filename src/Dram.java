public class Dram extends AbstractCurrency {
    public Dram(double value) {
        super(value);
    }

    public Dram() {
    }

    @Override
    public void printValue() {
        System.out.println(getValue() + " D");
    }
}
