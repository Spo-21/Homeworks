import Converter;

public class EuroConverter implements Converter {
    @Override
    public AbstractCurrency convert(AbstractCurrency value) {
        double temp;
        if(value instanceof Ruble){
            temp = value.getValue() * 71.06;
        }
        else if (value instanceof Dram){
            temp = value.getValue() * 529.63;
        }
        else if (value instanceof Dollar){
            temp = value.getValue() * 1.108;
        }
        else if (value instanceof PoundSterling){
            temp = value.getValue() * 0.85;
        }
        else {
            temp = value.getValue();
        }
        Euro euro = new Euro();
        euro.setValue(temp);
        return euro;
    }
}
