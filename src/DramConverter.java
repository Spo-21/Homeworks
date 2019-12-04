import Converter;

public class DramConverter implements Converter {
    @Override
    public AbstractCurrency convert(AbstractCurrency value) {
        double temp;
        if(value instanceof Ruble){
            temp = value.getValue() * 0.134;
        }
        else if (value instanceof Dollar){
            temp = value.getValue() * 0.0021;
        }
        else if (value instanceof Euro){
            temp = value.getValue() * 0.0019;
        }
        else if (value instanceof PoundSterling){
            temp = value.getValue() * 0.0016;
        }
        else {
            temp = value.getValue();
        }
        Dram dram = new Dram();
        dram.setValue(temp);
        return dram;
    }
}
