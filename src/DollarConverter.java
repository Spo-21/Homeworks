import Converter;

public class DollarConverter implements Converter {
    @Override
    public AbstractCurrency convert(AbstractCurrency value) {
        double temp;
        if(value instanceof Ruble){
            temp = value.getValue() * 64.17;
        }
        else if (value instanceof Dram){
            temp = value.getValue() * 477.98;
        }
        else if (value instanceof Euro){
            temp = value.getValue() * 0.9025;
        }
        else if (value instanceof PoundSterling){
            temp = value.getValue() * 0.77;
        }
        else {
            temp = value.getValue();
        }
        Dollar dollar = new Dollar();
        dollar.setValue(temp);
        return dollar;
    }
}
