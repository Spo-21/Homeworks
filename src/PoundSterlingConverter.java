import Converter;

public class PoundSterlingConverter implements Converter {
    @Override
    public AbstractCurrency convert(AbstractCurrency value) {
        double temp;
        if(value instanceof Ruble){
            temp = value.getValue() * 83.37;
        }
        else if (value instanceof Dram){
            temp = value.getValue() * 621.13;
        }
        else if (value instanceof Euro){
            temp = value.getValue() * 1.17;
        }
        else if (value instanceof Dollar){
            temp = value.getValue() * 1.23;
        }
        else {
            temp = value.getValue();
        }
        PoundSterling poundSterling = new PoundSterling();
        poundSterling.setValue(temp);
        return poundSterling;
    }
}
