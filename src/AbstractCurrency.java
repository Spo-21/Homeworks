public abstract class AbstractCurrency {
    double value;

    public AbstractCurrency(double value) {
        this.value = value;
    }
    public AbstractCurrency(){}

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract void printValue();
}
