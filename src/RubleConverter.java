import Converter;
import
public class RubleConverter implements Converter {
    @Override
    public AbstractCurrency convert(AbstractCurrency value) {
        double temp;
        if(value instanceof Dollar){
            temp = value.getValue() * 0.0156;
        }
        else if (value instanceof Dram){
            temp = value.getValue() * 7.45;
        }
        else if (value instanceof Euro){
            temp = value.getValue() * 0.0141;
        }
        else if (value instanceof PoundSterling){
            temp = value.getValue() * 0.012;
        }
        else {
            temp = value.getValue();
        }
        Ruble ruble = new Ruble();
        ruble.setValue(temp);
        return ruble;
    }
}
