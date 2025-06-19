public class FinancialForecast{
    public static double finalValue(double initialValue,double growth,int years){
        if(years==0) return initialValue;
        return (growth+1)*finalValue(initialValue,growth,years-1);
    }

    public static void main(String[] args){
        double initialValue=10000;
        double growth=0.08;
        int years=5;

        System.out.printf("Future Value after %d years: $%.2f\n", years, finalValue(initialValue,growth,years));
    }
}