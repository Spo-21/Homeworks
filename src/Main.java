public class Main {
    public static void main(String[] args){
        Converter dollarConverter = new DollarConverter();
        Dram dram = new Dram(100000);
        AbstractCurrency convert = new DollarConverter().convert(dram);
        convert.printValue();
    }
}
